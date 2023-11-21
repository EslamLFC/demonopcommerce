package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_wishList;

public class D08_WishlistStepDef {
    P08_wishList wish = new P08_wishList();

    @When("user clicks on wishlist button on a product")
    public void userClicksOnWishlistButtonOnAProduct() {
        wish.wishlistButton().click();
    }

    @Then("success message is triggered")
    public void successMessageIsTriggered() {
        wish.successMessageAssertion();
    }

    @And("user clicks on wish list tab")
    public void userClicksOnWishListTab() {
        wish.wishList_tab();
    }

    @Then("quantity should be bigger than zero")
    public void quantityShouldBeBiggerThanZero() {
        wish.wishlistQuantity();
    }
}
