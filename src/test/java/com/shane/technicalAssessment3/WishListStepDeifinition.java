package com.shane.technicalAssessment3;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListStepDeifinition {
	WishListActions wish = new WishListActions();
	@Given("User in the HomePage")
	public void user_in_the_home_page() {
	    HelperClass.openPage("https://demowebshop.tricentis.com/");
	}

	@When("User login to Account")
	public void user_login_to_account() {
	    wish.login("sd@gmail.com","123456@");
	    HelperClass.log.info("USer Login");
	}

	@When("User adds product to wishlist")
	public void user_adds_product_to_wishlist() {
	  wish.addToWishList();
	    HelperClass.log.info("User added to wishlist");

	}

	@When("user remove from wihslist")
	public void user_remove_from_wihslist() {
	   wish.removeWishList();
	    HelperClass.log.info("User removed from wish list");

	}

	@Then("User see empty wishList message")
	public void user_see_empty_wish_list_message() {
	   Assert.assertTrue(wish.verifyText().contains( "The wishlist is empty!"));
	    HelperClass.log.info("User get empty wishlist");

	}
}
