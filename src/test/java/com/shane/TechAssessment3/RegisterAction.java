package com.shane.TechAssessment3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public class RegisterAction {
	WebDriver driver;
	RegisterLocator registerlocator = null;
	baseClass baseclass = new baseClass();
	
	 public RegisterAction(){
		this.registerlocator = new RegisterLocator();
		PageFactory.initElements(baseclass.getDriver(), registerlocator);
	 }
	  public void regbutton() {
            registerlocator.regbutton.click();
	}
	  
	  public void gender() {
          registerlocator.gender.click();
	}
	
	  public void setFirstName(String strFirstname) {
          registerlocator.firstname.sendKeys(strFirstname);
	}
 
	  public void setlastName(String strLastname) {
          registerlocator.lastname.sendKeys(strLastname);
	}
	  
	  public void setEmail(String strEmail) {
          registerlocator.email.sendKeys(strEmail);
	}
	  
	  public void setPassword(String strPassword) {
          registerlocator.password.sendKeys(strPassword);
	}
	  
	  public void setCpassword(String strCpassword) {
          registerlocator.cpassword.sendKeys(strCpassword);
	}
	  public void register() {
         registerlocator.register.click();
	}
	  public String checkassert() {
         return registerlocator.checkassert.getText();
	}
}
