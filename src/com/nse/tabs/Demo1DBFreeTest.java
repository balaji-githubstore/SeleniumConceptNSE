package com.nse.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1DBFreeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.db4free.net/");
		
		driver.findElement(By.xpath("//b[contains(text(),'phpMyAdmin')]")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());		
		System.out.println(windows.get(0));
		System.out.println(windows.get(1));
		
		driver.switchTo().window(windows.get(1)); //switch to second tab
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_password")).sendKeys("admin");
		driver.findElement(By.id("input_go")).click();
		
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		
		String title=driver.getTitle();
		System.out.println(title);
	}

}
