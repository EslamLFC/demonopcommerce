package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_homeSliders;

public class D06_homeSlidersStepDef {
    P06_homeSliders slide = new P06_homeSliders();

    @When("user clicks on first slider")
    public void userClicksOnFirstSlider() {
        slide.chooseFirstSlider().click();
        slide.firstSlider().click();
    }

    @Then("user should be directed to first slider's content")
    public void userShouldBeDirectedToFirstSliderSContent() {
        slide.firstSliderAssertion();
    }

    @When("user clicks on second slider")
    public void userClicksOnSecondSlider() {
        slide.chooseSecondSlider().click();
        slide.secondSlider().click();
    }

    @Then("user should be directed to second slider's content")
    public void userShouldBeDirectedToSecondSliderSContent() {
        slide.secondSliderAssertion();
    }
}
