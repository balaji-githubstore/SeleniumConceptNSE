package com.nse.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo6php {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phptravels.net/");

		driver.findElement(By.xpath("//a[text()='flights']")).click();

		new Select(driver.findElement(By.id("flight_type"))).selectByVisibleText("Business");

		driver.findElement(By.id("autocomplete")).sendKeys("lax");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[text()='LAX']")).click();

		driver.findElement(By.id("autocomplete2")).sendKeys("dal");

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		// 22-04-2022
		driver.findElement(By.id("departure")).clear();
		driver.findElement(By.id("departure")).sendKeys("22-04-2022");

		driver.findElement(By.xpath("//span[contains(@class,'guest')]")).click();

		int adult = 5;

		for (int i = 2; i <= adult; i++) {
			driver.findElement(By.xpath("//i[@class='la la-plus']")).click();
		}

		int child = 3;
		for (int i = 1; i <= child; i++) {
			driver.findElement(By.xpath("(//i[@class='la la-plus'])[2]")).click();
		}

	}
}
