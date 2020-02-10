package io.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuoteSearchPageLocators {

    WebDriver driver;
    public QuoteSearchPageLocators(WebDriver driver)
    {
        this.driver = driver;
    }
    public WebElement getQuoteNumberTextbox()
    {
        return driver.findElement(By.id("quoteSearch_quoteNumber"));
    }

    public WebElement getSearchButton()
    {
        return driver.findElement(By.id("quoteSearch_searchButton"));
    }
}
