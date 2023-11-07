package com.shane.TechAssessment3;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {
	baseClass baseclass = new baseClass();
	 LoginActions loginaction = new LoginActions();
	 loginUtility obj = new loginUtility();
	 WebDriver driver ;
	
	 @Given("user is on login page")
	 public void user_is_on_login_page() {
			baseclass.openPage(obj.strUrl);
	 }

	 @Given("user clicks login link")
	 public void user_clicks_login_link() {
				loginaction.logbutton();
	 }

	 @When("user enters email")
	 public void user_enters_email() {
				loginaction.setEmail(obj.strEmail);
	 }

	 @When("user enters password")
	 public void user_enters_password() {
				loginaction.setPassword(obj.strPassword);
	 }

	 @When("user clicks login button")
	 public void user_clicks_login_button() {
				loginaction.login();
	 }

	 @Then("user is logged in")
	 public void user_is_logged_in() {
		 Assert.assertTrue(loginaction.confirmLogin());
	 }

	 @When("user enters invalid email")
	 public void user_enters_invalid_email() {
		loginaction.setEmail(obj.strInvalidEmail);
	 }

	 @When("user enters invalid password")
	 public void user_enters_invalid_password() {
		loginaction.setPassword(obj.StrInvalidPassword);
	 }

	 @Then("user gets login unsuccessfull messege")
	 public void user_gets_login_unsuccessfull_messege() {

	 }



}