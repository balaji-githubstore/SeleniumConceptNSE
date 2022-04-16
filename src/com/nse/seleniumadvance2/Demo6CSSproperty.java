package com.nse.seleniumadvance2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Demo6CSSproperty {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://courses.letskodeit.com/practice");

		String beforBgColor = driver.findElement(By.id("mousehover")).getCssValue("background-color");
		System.out.println(beforBgColor);

		String hexBgBefore = Color.fromString(beforBgColor).asHex();
		System.out.println(hexBgBefore);

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("mousehover"))).perform();

		String AfterBgColor = driver.findElement(By.id("mousehover")).getCssValue("background-color");
		System.out.println(AfterBgColor);
		String hexBgaft = Color.fromString(AfterBgColor).asHex();
		System.out.println(hexBgaft);

		String font = driver.findElement(By.id("mousehover")).getCssValue("font");
		System.out.println(font);
		
		
	}
}
