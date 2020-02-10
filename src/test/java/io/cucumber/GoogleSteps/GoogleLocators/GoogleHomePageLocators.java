package io.cucumber.GoogleSteps.GoogleLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePageLocators {

    WebDriver driver;

    public GoogleHomePageLocators(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement getSearchTextbox()
    {
    return driver.findElement(By.name("q"));
    }

    public WebElement getSearchButton()
    {
        return driver.findElement(By.name("btnK"));
    }
}
