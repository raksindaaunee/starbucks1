   package com.steps;

import com.baseclass.BaseClass;
import com.pages.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends BaseClass{
	//WebDriver driver;
	//Pages pj;
    
	@Given("^user need to go to login page$")
	public void user_need_to_go_to_login_page() throws Throwable {
		
		driver = getDriver();
		driver.get(url);
	    
	}

	@When("^user need to click on my account button$")
	public void user_need_to_click_on_my_account_button() throws Throwable {
		Pages pj = new Pages(driver);
		pj.getMyaccount().click();
	} 

	@When("^need to put username <raksinda@gmail\\.com>$")
	public void need_to_put_username_raksinda_gmail_com() throws Throwable {
	  Pages pj=new Pages(driver);
	  pj.getUsername().sendKeys("raksinda@gmail.com");
	  
	}

	@When("^also need to put password <(\\d+)>$")
	public void also_need_to_put_password(int arg1) throws Throwable {
	    Pages pj= new Pages(driver);
	    pj.getPassword().sendKeys("123456");
	    
	}

	@When("^user will able to click on sign in button$")
	public void user_will_able_to_click_on_sign_in_button() throws Throwable {
	    Pages pj=new Pages(driver);
	    pj.getSubmit().click();
	}

	@Then("^User will able to log in in that page$")
	public void user_will_able_to_log_in_in_that_page() throws Throwable {
	 
	}

}
