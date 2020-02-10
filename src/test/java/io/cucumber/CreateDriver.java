package io.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class CreateDriver {

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anees_fatima\\Projects\\chromedriver_win32_79\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http:google.com");
        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("menu_main_label"))));// this is for DSA application
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='q' and @title='Search']"))));// this is for test of google application
        return driver;
    }

}
