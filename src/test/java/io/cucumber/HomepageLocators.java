package io.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageLocators {

    WebDriver driver;
    public HomepageLocators(WebDriver driver)
    {
        this.driver = driver;
    }
    public WebElement getMenu()
    {
        return driver.findElement(By.id("menu_main_label"));
    }

    public WebElement getQuoteOption()
    {
        return driver.findElement(By.id("menu_quoteSearch"));
    }
}
