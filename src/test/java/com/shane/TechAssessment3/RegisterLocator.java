package com.shane.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocator {
	@FindBy(xpath = "//a[@href='/register']")
	WebElement regbutton;

	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement gender;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement cpassword;

	@FindBy(xpath = "//input[@id='register-button']")
	WebElement register;

	@FindBy(xpath = "//div[@class='result']")
	WebElement checkassert;
}
