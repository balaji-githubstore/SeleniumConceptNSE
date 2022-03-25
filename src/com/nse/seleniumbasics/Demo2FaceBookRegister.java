package com.nse.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2FaceBookRegister {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\Software\\msedgedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Balaji");
		driver.findElement(By.name("lastname")).sendKeys("Dinakaran");
		driver.findElement(By.name("reg_email__")).sendKeys("bala12334@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Bala@123");
		
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByIndex(11);
		
		Select selectMonth=new Select(driver.findElement(By.name("birthday_month")));
		selectMonth.selectByValue("4");
		
		Select selectYear=new Select(driver.findElement(By.xpath("//select[@aria-label='Year']")));
		selectYear.selectByVisibleText("2010");
		
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
}
