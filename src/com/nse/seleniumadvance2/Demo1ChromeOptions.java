package com.nse.seleniumadvance2;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1ChromeOptions {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		
//		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
		//options.addArguments("--disable-notifications");
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "D:\\");
		
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//driver.get("https://www.irctc.co.in/");
		driver.get("https://www.selenium.dev/downloads/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.partialLinkText("32 bit")).click();
		Thread.sleep(15000);
		driver.quit();
		
	}

}
