package com.nse.seleniumadvance2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7WinAuth {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		http://Username:Password@SiteURL
//		driver.get("https://dina:pass123@softwaretesting.com/");

		driver.get("https://softwaretesting.com/");
		
		Runtime.getRuntime().exec("D:\\Mine\\Company\\NSE\\window_auth.exe");
	}
}
