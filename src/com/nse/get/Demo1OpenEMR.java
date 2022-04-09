package com.nse.get;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo1OpenEMR {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.openemr.io/b/openemr");
		
	//	driver.findElement(By.cssSelector("#authUser")).sendKeys("admin");
		
		String text =driver.findElement(By.partialLinkText("Licensing ")).getText();
		System.out.println(text);
	
		String href=driver.findElement(By.partialLinkText("Licensing ")).getAttribute("href");
		System.out.println(href);
		
		String plh=driver.findElement(By.cssSelector("#authUser")).getAttribute("placeholder");
		System.out.println(plh);
		
		Point p= driver.findElement(By.partialLinkText("Licensing ")).getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		
		Actions action=new Actions(driver);
		action.moveByOffset(p.x, p.y).perform();
		
		Dimension size= driver.findElement(By.cssSelector("#authUser")).getSize();
		
		System.out.println(size.width);
		System.out.println(size.height);
		
	}
}
