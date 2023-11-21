package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

public class D03_currenciesStepDef {
    P03_homePage currencies = new P03_homePage();
    @Given("user go to home page")
    public void userGotoHomePage(){
    }

    @When("user select Euro currency from currencies dropdown menu")
    public void userSelectEuroCurrencyFromCurrenciesDropdownMenu() {
        currencies.selectEuroCurrency();
    }

    @Then("all results should have Euro currency symbol")
    public void allResultsShouldHaveEuroCurrencySymbol() {
        currencies.resultsAssertion();

    }

}
