package com.baseclass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
     public WebDriver driver;
	
	public String url = "https://demo.oscommerce.com/";
	
	public WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
		
	}
	 
}
