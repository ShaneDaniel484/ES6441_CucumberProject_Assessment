package com.shane.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class WishListActions {
WishListLocators wish ;
baseClass baseclass = new baseClass();


	public WishListActions() {
		WishListLocators wish = new WishListLocators();
		
		PageFactory.initElements(baseclass.getDriver(), wish);
	}
	
	
	public void clicklogin() {
		wish.loginLink.click();
	}
	public void setEmail(String email) {
		wish.email.sendKeys(email);
	}
	public void setPassword(String password) {
		wish.password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		wish.loginButton.click();
	}
	
	public void clickShoes() {
		wish.clickShoes.click();
	}
	
	public void clickSneakers() {
		wish.clickSneakers.click();
	}
	public void addWishList() {
		wish.addWishList.click();
	}
	public void clickWishList() {
		wish.clickWishList.click();
	}
	public void clickRemove() {
		wish.clickRemove.click();
	}
	public void clickUpdateWish() {
		wish.clickUpdateWishList.click();
	}
	public String verifyText() {
		return wish.verifyText.getText();
	}
	public void login(String email, String password) {
		clicklogin();
		setEmail(email);
		setPassword(password);
		clickLoginButton();
	}
	
	public void addToWishList() {
		clickShoes();
		clickSneakers();
		addWishList();
	}
	public void removeWishList() {
		clickWishList();
		clickRemove();
		clickUpdateWish();
	}
}
