package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_followUs;
import org.testng.Assert;

public class D07_followUsStepDef {
    P07_followUs links = new P07_followUs();

    @When("user opens facebook link")
    public void userOpensFacebookLink() {
        links.facebookButton().click();
        links.getActual_url();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        Assert.assertEquals(links.actual_url,arg0);
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        links.twitterButton().click();
        links.getActual_url();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        links.rssButton().click();
        links.getActual_url();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        links.youtubeButton().click();
        links.getActual_url();
    }
}
