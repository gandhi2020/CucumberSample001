package com.gs2020.test.stepdefinitions;

import com.gs2020.test.pages.HerokuAppPages;
import com.gs2020.test.utilities.GenericUtil;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class C001LoginSteps {
    GenericUtil genericUtil;
    HerokuAppPages herokuAppPages;

    public C001LoginSteps(GenericUtil genericUtil, HerokuAppPages herokuAppPages){
        this.genericUtil = genericUtil;
        this.herokuAppPages = herokuAppPages;
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        herokuAppPages.openWebSite();
    }
    @When("user entered {string} and {string}")
    public void user_entered_and(String string, String string2) {
        herokuAppPages.setUserName(string);
        herokuAppPages.setPassword(string2);
    }

    @When("user clicked login button")
    public void user_clicked_login_button() {
        herokuAppPages.selectLoginButton();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() throws InterruptedException {
        herokuAppPages.loginAssertion();
    }

//    @Given("I am on the login page")
//    public void iAmOnLoginPage() {
//        genericUtil.getDriver().get("https://the-internet.herokuapp.com/login");
//    }
//
//    @When("I enter my username and password")
//    public void iEnterUsernameAndPassword() {
//
//        genericUtil.getDriver().findElement(By.id("username")).sendKeys("tomsmith");
//        genericUtil.getDriver().findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//    }
//
//    @When("I enter my {string} and {string}")
//    public void i_enter_my_and(String string, String string2) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("I click on the login button")
//    public void iClickOnLoginButton() {
////        driver.findElement(By.id("loginBtn")).click();
//        genericUtil.getDriver().findElement(By.className("radius")).click();
//    }
//
//
//    @Then("I should be logged in successfully")
//    public void iShouldBeLoggedInSuccessfully() {
//        String expectedUrl = "https://the-internet.herokuapp.com/secure";
//        String actualUrl = genericUtil.getDriver().getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//        genericUtil.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        genericUtil.getDriver().quit();
//    }
}
