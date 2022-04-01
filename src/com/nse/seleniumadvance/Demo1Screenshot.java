package com.nse.seleniumadvance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1Screenshot {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File file= ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("error.png"));
		
		
//		ChromeDriver d=(ChromeDriver) driver;
//		
//		File file1= d.getScreenshotAs(OutputType.FILE);
//		file1.renameTo(new File("error.png"));
		
	}

}
