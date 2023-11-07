package com.shane.TechAssessment3;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListSD {
	baseClass baseclass = new baseClass();
	WishListActions wish = new WishListActions();
	@Given("user is in the HomePage")
	public void user_is_in_the_HomePage() {
	    baseclass.openPage("https://demowebshop.tricentis.com/");
	}

	@When("user logs into his Account")
	public void user_logs_into_his_Account() {
	    wish.login("logsri5@gmail.com","123456");
	    baseclass.log.info("User Logged in");
	}

	@When("user adds product to wishlist")
	public void user_adds_product_to_wishlist() {
	  wish.addToWishList();
	  baseclass.log.info("User added item to wishlist");

	}

	@When("user removes from whislist")
	public void user_removes_from_whislist() {
	   wish.removeWishList();
	   baseclass.log.info("User removed item from wishlist");

	}

	@Then("user gets empty wishList message")
	public void user_gets_empty_wishList_message() {
	   Assert.assertTrue(wish.verifyText().contains( "The wishlist is empty!"));
	   baseclass.log.info("User gets the  empty wishlist");

	}
}
