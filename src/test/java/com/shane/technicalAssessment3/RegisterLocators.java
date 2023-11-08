package com.shane.technicalAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
	@FindBy(xpath="//a[text()='Register']")
	WebElement registerlink;
	
	@FindBy(id="gender-male")
	WebElement genderMale;
	
	@FindBy(id="gender-female")
	WebElement genderFemale;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement cpassword;
	
	@FindBy(id="register-button")
	WebElement registerButton;
	
	@FindBy(xpath="//div[@class='result']")
	WebElement verifyText;
	
	@FindBy(xpath="//li[text()='The specified email already exists']")
	WebElement errorText;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logOut;
}
