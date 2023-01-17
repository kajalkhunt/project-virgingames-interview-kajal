package com.virgin.steps;

import com.virgin.pages.LiveCasinoPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LiveCasinoSteps {
    @Given("^I am on Virgin games homepage$")
    public void iAmOnVirginGamesHomepage() {
    }

    @When("^I am clicking on live casino tab$")
    public void iAmClickingOnLiveCasinoTab() {
        new LiveCasinoPage().clickAcceptCookie();

    }

    @Then("^I am on live casino page$")
    public void iAmOnLiveCasinoPage() {
        new LiveCasinoPage().liveCasinoTab();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String expectedMessage)  {
        Assert.assertEquals("User is not able to verify text Live Blackjack Games", expectedMessage, new LiveCasinoPage().verifyLiveBlackjackGames());

    }
}
