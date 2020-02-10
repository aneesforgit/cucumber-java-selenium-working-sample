package io.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MultipleExamplesSteps {

    private WebDriver driver = CreateDriver.getDriver();
    HomepageLocators locateInHomePage = new HomepageLocators(driver);
    QuoteSearchPageLocators locateInQuoteSearchPage = new QuoteSearchPageLocators(driver);

    @Given("I am in DSA home page for {string}")
    public void i_am_in_DSA_home_page_for(String string) {

    }

    @When("I click on Menu button for {string}")
    public void i_click_on_Menu_button_for(String string) {

    }

    @When("choose Quote under Search for {string}")
    public void choose_Quote_under_Search_for(String string) {

    }

    @Then("I should be navigated to Quote search page whose URL should end with {string} for {string}")
    public void i_should_be_navigated_to_Quote_search_page_whose_URL_should_end_with_for(String string, String string2) {

    }

}
