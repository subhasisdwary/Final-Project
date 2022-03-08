package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestApp3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..//SeleniumApp1//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/2071995/OneDrive%20-%20Cognizant/Documents/JQuery!!/reg-1.html");
		WebElement obj = driver.findElement(By.name("txtcname"));
		if(obj.isEnabled()==true)
		{
			obj.sendKeys("Subhasis Dwary");
			String gettext = obj.getAttribute("value");
			System.out.println("Given name : " + gettext);
			Thread.sleep(2000);			
			obj.clear();
			Thread.sleep(2000);
			highlight(driver, driver.findElement(By.id("cname")));
			Thread.sleep(1000);
		}
		else {
			System.out.println("Textbox is not enabled");
	}
		highlight(driver, driver.findElement(By.id("heading")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.id("gender")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.id("male")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.id("female")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.id("location")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.id("email")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.id("password")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.id("btn2")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.id("cl")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.id("btn1")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.xpath("//h2[contains(text(),'This is For registration')]")));
		Thread.sleep(1000);	
	
		
	}

	private static void highlight(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:green')", element);
	}

}
