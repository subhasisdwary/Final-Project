package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "..//SeleniumApp1//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com/");

	}

}
