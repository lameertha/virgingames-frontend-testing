package com.virgingames.cucumber.mysteps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/* Created
 * by Lamee */
public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^I click on Login page$")
    public void iClickOnLoginPage() {
        new HomePage().clickOnLoginButton();
    }

    @When("^I enter \"([^\"]*)\" in username field$")
    public void iEnterInUsernameField(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("^I enter \"([^\"]*)\" in password field$")
    public void iEnterInPasswordField(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginFeature();
    }

    @Then("^I should not login to system successfully and shows \"([^\"]*)\"$")
    public void iShouldNotLoginToSystemSuccessfullyAndShows(String errorMessage) {
        Assert.assertEquals(new LoginPage().ErrorMessage(), "Please try again, your username/email or password has not been recognised");
    }
}
