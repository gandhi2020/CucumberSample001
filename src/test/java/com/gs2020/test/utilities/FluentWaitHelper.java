package com.gs2020.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//A helper class to wait until elements are loaded into a page
public class FluentWaitHelper {

    private final WebDriver driver;

    public FluentWaitHelper(WebDriver driver){
        this.driver = driver;
    }

    public WebElement waitForElementToBeVisible(By locator, int timeoutSeconds){
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeoutSeconds))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        return wait.until(driver -> driver.findElement(locator));
    }

    public WebElement waitForElementToBeClickable(By locator, int timeoutSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
        return wait.until(driver -> driver.findElement(locator));
    }
}
