package com.shane.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(xpath = "//a[@href='/login']")
	WebElement loginLink;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement logoutButton;
}
