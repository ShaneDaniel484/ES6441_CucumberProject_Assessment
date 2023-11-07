package com.shane.TechAssessment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginActions {
	WebDriver driver;
	LoginLocators loginlocator = null;
	
	
	 public LoginActions(){
		this.loginlocator = new LoginLocators();
		PageFactory.initElements(baseClass.getDriver(), loginlocator);
	 }
	
	  public void logbutton() {
          loginlocator.loginLink.click();
	}
	  
	  public void setEmail(String strEmail) {
          loginlocator.email.sendKeys(strEmail);
	}
	  
	  public void setPassword(String strPassword) {
          loginlocator.password.sendKeys(strPassword);
	}
	  
	  public void login() {
          loginlocator.loginButton.click();
	}
	  
	public boolean confirmLogin() {
		return loginlocator.logoutButton.isDisplayed();
	}
}
