package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_search;
import org.openqa.selenium.Keys;

public class D04_searchStepDef {
    P04_search search = new P04_search();
    @When("user search using name {string}")
    public void userSearchUsingName(String arg0) {
        search.searchFiled().sendKeys(arg0 + Keys.ENTER);
        search.waiting();
    }


    @Then("url should contain search?q=")
    public void urlShouldContainSearchQ() {
        search.urlAssertion();

    }

    @And("search should show relevant results")
    public void searchShouldShowRelevantResults() {
        search.searchResultAssertion();
    }


@When("user search for product using sku {string}")
public void userSearchForProductUsingSku(String arg0) {
       search.searchFiled().sendKeys(arg0 + Keys.ENTER);
}

    @And("user clicks on the product in search result")
    public void userClicksOnTheProductInSearchResult() {
      search.searchResultProduct().click();
    }

    @Then("sku should match searched sku")
    public void skuShouldMatchSearchedSku() {
        search.skuOfProductAssertion();

    }



}
