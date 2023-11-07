package com.shane.TechAssessment3;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSD {
	baseClass baseclass = new baseClass();
	RegisterAction registeraction = new RegisterAction();
	RegisterLocator locator = new RegisterLocator();
	WebDriver driver ;



	@Given("launching the website DemoShop")
	public void launching_the_website_demo_shop() {
		baseclass.openPage("https://demowebshop.tricentis.com/fiction");

	}

	@When("click the register in webpage")
	public void click_the_register_in_webpage() {
		registeraction.regbutton();
	}

	@When("given the gender in register page")
	public void given_the_gender_in_register_page() {
		registeraction.gender();
	}

	@When("given the first name in register page")
	public void given_the_first_name_in_register_page(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class, String.class);
		for(Map<String,String> form : signUpForm) {
			String firstname =form.get("firstname");
			System.out.println("firstname:" +firstname);
			registeraction.setFirstName(firstname);
		}
	}

	@When("given the last name in register page")
	public void given_the_last_name_in_register_page(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class, String.class);
		for(Map<String,String> form : signUpForm) {
			String lastname = form.get("lastname");
			System.out.println("lastname:" +lastname);
			registeraction.setlastName(lastname);
		}
	}

	@When("given the email in register page")
	public void given_the_email_in_register_page(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class, String.class);
		for(Map<String,String> form : signUpForm) {
			String email = form.get("Email");
			System.out.println("email:" +email);
			registeraction.setEmail(email);
		}
	}

	@When("given the password in register page")
	public void given_the_password_in_register_page(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class, String.class);
		for(Map<String,String> form : signUpForm) {
			String password = form.get("password");
			System.out.println("passsword:" +password);
			registeraction.setPassword(password);
		}
	}

	@When("click the confirm password for agree")
	public void click_the_confirm_password_for_agree(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class, String.class);
		for(Map<String,String> form : signUpForm) {
			String cpassword = form.get("cpassword");
			System.out.println("cpassword:" +cpassword);
			registeraction.setCpassword(cpassword);
		}
	}

	@When("At end click the register")
	public void at_end_click_the_register() {
		registeraction.register();
	}

	@Then("checking the register was successfull")
	public void checking_the_register_was_successfull() {
		Assert.assertEquals(registeraction.checkassert(),"Your registration completed");


	}
}
