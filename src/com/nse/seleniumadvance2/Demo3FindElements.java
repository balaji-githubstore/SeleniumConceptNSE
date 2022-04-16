package com.nse.seleniumadvance2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3FindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://google.com");
		
		List<WebElement> elements= driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		//elements.get(1).click();
//		String text=elements.get(0).getText();
//		System.out.println(text);
		
		for(int i=0;i<elements.size();i++)
		{
			String text=elements.get(i).getText();
			System.out.println(text);
			
			String att=elements.get(i).getAttribute("href");
			System.out.println(att);
			
			if(text.equals("Images"))
			{
				elements.get(i).click();
				break;
			}
		}
	}
}





