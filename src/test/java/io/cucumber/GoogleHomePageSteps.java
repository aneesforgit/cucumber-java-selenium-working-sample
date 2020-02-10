package io.cucumber;//package io.cucumber;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.CreateDriver;
import io.cucumber.GoogleSteps.GoogleLocators.GoogleHomePageLocators;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class GoogleHomePageSteps {


    WebDriver driver = CreateDriver.getDriver();

    GoogleHomePageLocators homePageLocators = new GoogleHomePageLocators(driver);

    @Given("I am in google home page")
    public void i_am_in_google_home_page() {
        assert homePageLocators.getSearchTextbox().isDisplayed();
    }

    @When("I search {string}")
    public void i_search(String searchQuery) {
        homePageLocators.getSearchTextbox().sendKeys(searchQuery);
    }

    @When("Hit search button")
    public void hit_search_button() {
        homePageLocators.getSearchButton().click();
    }

    @Then("I should be navigated to search results page")
    public void i_should_be_navigated_to_search_results_page() throws InterruptedException {
        Thread.sleep(3000);
        assert driver.getTitle().contains("selenium - Google Search");
    }

    @After
    public void closeBrowser() {
        driver.close();
    }
}
