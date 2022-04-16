package com.nse.seleniumadvance2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5Javascript {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.malaysiaairlines.com/in/en.html");

	
		
		//will not work on readonly element
		//driver.findElement(By.name("end")).sendKeys("30 Apr 2022");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//option 1
		js.executeScript("document.querySelectorAll('[name=end]')[2].value='30 May 2022'");
		
		//option 2
		WebElement element=driver.findElement(By.xpath("(//input[@name='end'])[3]"));
		js.executeScript("arguments[0].value='29 Apr 2022'",element);
	}
}
