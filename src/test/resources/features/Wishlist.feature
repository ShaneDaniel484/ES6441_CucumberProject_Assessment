Feature: Add product to wishList and Remve it

Scenario: Add to WishList and Remove

Given user is in the HomePage
When user logs into his Account
And user adds product to wishlist
And user removes from whislist
Then user gets empty wishList message 