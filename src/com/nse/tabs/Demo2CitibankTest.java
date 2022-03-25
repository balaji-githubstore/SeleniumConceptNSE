package com.nse.tabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2CitibankTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.online.citibank.co.in/");
	
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("User_Id")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@class='cl fl ls_login']")).click();
		
		//update the session id list
		windows=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(2));
		
		driver.findElement(By.linkText("Close this window")).click();
		
		
	}

}
