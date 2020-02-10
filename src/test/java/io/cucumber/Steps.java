//package io.cucumber;
//
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.cucumber.CreateDriver;
//import io.cucumber.GoogleSteps.GoogleLocators.GoogleHomePageLocators;
//import io.cucumber.core.api.Scenario;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.openqa.selenium.WebDriver;
//
//public class Steps {
//
//    @BeforeClass
//    public  WebDriver driver(){
//        WebDriver driver = CreateDriver.getDriver();
//        System.out.println("Instantiated browser.........................");
//        return driver;
//    }
//
//    GoogleHomePageLocators homePageLocators = new GoogleHomePageLocators(driver());
//
//    @AfterClass
//    public void closeBrowser()
//    {
//        driver().close();
//    }
//
//    @Given("I am in google home page")
//    public void i_am_in_google_home_page() {
//        assert homePageLocators.getSearchButton().isDisplayed();
//    }
//
//    @When("I search {string}")
//    public void i_search(String searchQuery) {
//        homePageLocators.getSearchTextbox().sendKeys(searchQuery);
//    }
//
//    @When("Hit search button")
//    public void hit_search_button() {
//        homePageLocators.getSearchButton().click();
//    }
//
//    @Then("I should be navigated to search results page")
//    public void i_should_be_navigated_to_search_results_page() {
//        assert driver().getTitle().equalsIgnoreCase("selenium - Google Search");
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////import io.cucumber.core.api.Scenario;
////import io.cucumber.java.After;
////import org.openqa.selenium.WebDriver;
////
////public class Steps {
////
////    private WebDriver driver = CreateDriver.getDriver();
////    HomepageLocators locateInHomePage = new HomepageLocators(driver);
////    QuoteSearchPageLocators locateInQuoteSearchPage = new QuoteSearchPageLocators(driver);
////
////    @Given("I am in DSA home page")
////    public void i_am_in_DSA_home_page() {
////        System.out.println("Launched DSA application..................................................");
////    }
////
////    @When("I click on Menu button")
////    public void i_click_on_Menu_button() {
////        locateInHomePage.getMenu().click();
////    }
////
////    @When("choose Quote under Search")
////    public void choose_Quote_under_Search() {
////        locateInHomePage.getQuoteOption().click();
////    }
////
////    @Then("I should be navigated to Quote search page whose URL should end with {string}")
////    public void i_should_be_navigated_to_Quote_search_page_whose_URL_should_end_with(String endsWith) {
////        assert driver.getCurrentUrl().endsWith(endsWith);
////    }
////
////    @When("I provide {string} and hit search button")
////    public void i_provide_and_hit_search_button(String quoteNumber) {
////        locateInQuoteSearchPage.getQuoteNumberTextbox().sendKeys(quoteNumber);
////        locateInQuoteSearchPage.getSearchButton().click();
////    }
////
////    @Then("It should open Quote details page whose url should end with {string}")
////    public void it_should_open_Quote_details_page_whose_url_should_end_with(String quoteUrl) {
////        assert driver.getCurrentUrl().endsWith(quoteUrl);
////    }
////
////    @After
////    public void after(Scenario scenario) {
////        driver.close();
////    }
////
////}
