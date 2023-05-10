package com.gs2020.test.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    private WebDriver driver;

    @Given("I am on the login page")
    public void iAmOnLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.get("http://www.example.com/login");
        driver.get("https://app.hubspot.com/login");
    }

    @When("I enter my username and password")
    public void iEnterUsernameAndPassword() {
//        driver.findElement(By.id("username")).sendKeys("myusername");
//        driver.findElement(By.id("password")).sendKeys("mypassword");
        driver.findElement(By.id("username")).sendKeys("ksgxyz2016@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Ksg@2016");
    }

    @When("I click on the login button")
    public void iClickOnLoginButton() {
        driver.findElement(By.id("loginBtn")).click();
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
//        String expectedUrl = "http://www.example.com/home";
        String expectedUrl = "https://app.hubspot.com/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        driver.quit();
    }
}
