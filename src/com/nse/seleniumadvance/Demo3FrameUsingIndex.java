package com.nse.seleniumadvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//using frame webelement 
public class Demo3FrameUsingIndex {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//using index
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("hello");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		driver.switchTo().defaultContent();
		
		
	}
}



