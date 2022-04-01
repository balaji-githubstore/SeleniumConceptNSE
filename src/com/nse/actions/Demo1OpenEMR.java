package com.nse.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1OpenEMR {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.openemr.io/b/openemr");
		
		driver.findElement(By.cssSelector("#authUser")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("#clearPass")).sendKeys("pass");
//		driver.findElement(By.id("clearPass")).sendKeys(Keys.ENTER);
		
		
		new Select(driver.findElement(By.cssSelector("select[name=languageChoice]"))).selectByVisibleText("English (Indian)");

		
		driver.findElement(By.cssSelector("[type=submit]")).click();
		
		driver.findElement(By.xpath("//div[text()='Patient']")).click();
		driver.findElement(By.xpath("//div[text()='New/Search']")).click();
		
	
	}
}
