package com.nse.seleniumadvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Upload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		driver.get("https://nasscom.in/nasscom-membership");
//		driver.findElement(By.id("edit-field-memorandum-article-of-asso-und-0-upload")).sendKeys("D:\\Balaji-Profile.pdf");
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Balaji-Profile.pdf");
	}
}
