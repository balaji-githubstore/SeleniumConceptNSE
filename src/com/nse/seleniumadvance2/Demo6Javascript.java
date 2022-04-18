package com.nse.seleniumadvance2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6Javascript {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.malaysiaairlines.com/in/en.html");

		// will not work on readonly element
		// driver.findElement(By.name("end")).sendKeys("30 Apr 2022");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// option 1
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);

		String duration = js
				.executeScript(
						"return document.querySelectorAll('[class=\"video-stream html5-main-video\"]')[0].duration")
				.toString();
		System.out.println(duration);
	}
}
