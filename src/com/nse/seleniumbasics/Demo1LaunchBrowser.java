package com.nse.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\Software\\msedgedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		//maxmize
		//set the implicit wait 
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("bala@gmail.com");
		
		By loc= By.id("email");
		WebElement ele= driver.findElement(loc);
		ele.sendKeys("hello@gmail.com");
		
	
	}

}





