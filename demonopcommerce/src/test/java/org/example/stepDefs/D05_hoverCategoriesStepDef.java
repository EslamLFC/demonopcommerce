package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hoverCategories;

public class D05_hoverCategoriesStepDef {
    P05_hoverCategories hover = new P05_hoverCategories();

    @When("user go to home page and hover on main category")
    public void userGoToHomePageAndHoverOnMainCategory() {
        hover.mainCategory();
    }

    @And("user select one sub-category and click on it")
    public void userSelectOneSubCategoryAndClickOnIt() {
        hover.subCategoryText();
        hover.selectSubCategory();
        hover.pageTitleText();
    }

    @Then("sub-category text should be equal to sub-category page title")
    public void subCategoryTexShouldBeEqualToSubCategoryPageTitle() {
        hover.textAssertion();
    }
}
