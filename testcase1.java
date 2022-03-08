package com.selepack;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "../MyFirstSeleniumApp/chromedriver.exe");  // value is path of the exe file
		//WebDriver web = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "../MyFirstSeleniumApp/geckodriver.exe");  // value is path of the exe file
		WebDriver web = new FirefoxDriver();
		web.get("C:\\JavaClass\\Seleinum\\Test.html");		
		System.out.println(web.getTitle());
		System.out.println(web.getCurrentUrl());
	}
}
