package com.nse.tabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3CitibankTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.online.citibank.co.in/");

		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text()='APPLY FOR CREDIT CARDS']")).click();

		List<String> windows = new ArrayList<String>(driver.getWindowHandles());

		for (String window : windows) 
		{
			System.out.println(window);
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);

			if (title.equals("Online Credit Card Application Form | Citi India")) {
				break;
			}

			System.out.println("------------------------");
		}
		
		//points to Citibank India
		//do operation
		driver.close();

		driver.quit();
	}

}
