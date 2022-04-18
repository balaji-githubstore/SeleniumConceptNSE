package com.nse.seleniumadvance2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8Upload {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.ilovepdf.com/pdf_to_word");
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Balaji-Profile.pdf");
		driver.findElement(By.id("pickfiles")).click();
		
		Runtime.getRuntime().exec("D:\\Mine\\Company\\NSE\\Upload.exe");
	}
}
