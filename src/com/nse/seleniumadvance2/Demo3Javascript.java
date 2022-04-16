package com.nse.seleniumadvance2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3Javascript {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");
		
//		driver.findElement(By.cssSelector("[data-track=login]")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector('[data-track=login]').click()");
	}
}
