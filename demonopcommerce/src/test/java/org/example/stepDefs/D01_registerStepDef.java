package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();
    @When("user go to register page")
    public void goRegisterPage()
    {
        register.registerlink().click();
    }

    @When("user select  gender type")
    public void userSelectGenderType() {
        register.chooseGenderType().click();

    }
    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        register.enterFirstname().sendKeys(arg0);
        register.enterLastname().sendKeys(arg1);
    }


    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        register.dayOfBirth();
        register.monthOfBirth();
        register.yearOfBirth();
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        register.enterEmail().sendKeys(arg0);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        register.enterPassword().sendKeys(arg0);
        register.confirmPassword().sendKeys(arg1);

    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.clickRegister().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        register.successAssertion();
    }


    }
