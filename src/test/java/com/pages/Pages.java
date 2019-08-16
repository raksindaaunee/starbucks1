package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	
	WebDriver driver;
	
	public Pages(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='ui-button-text'])[3]")
	private WebElement myaccount;
	public WebElement getMyaccount() {
		return myaccount;
	}
	@FindBy(xpath="//input[@name='email_address']")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="(//span[@class='ui-button-text'])[4]")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	
}
