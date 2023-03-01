package com.bd.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("can");
		Thread.sleep(3000);
		List<WebElement> data = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		Thread.sleep(3000);
		for(WebElement datas : data)
		{
			if (datas.getText().equals("Canada"))
			{
				datas.click();
				break;
			}
		}
	
		driver.quit();
	}


	
}
