package com.gs2020.test.stepdefinitions;

import com.gs2020.test.pages.OrangeHRMAppPages;
import com.gs2020.test.utilities.FluentWaitHelper;
import com.gs2020.test.utilities.GenericUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C002LoginSteps {

    GenericUtil genericUtil;
    OrangeHRMAppPages orangeHRMAppPages;

    public C002LoginSteps(GenericUtil genericUtil, OrangeHRMAppPages orangeHRMAppPages){
        this.genericUtil = genericUtil;
        this.orangeHRMAppPages = orangeHRMAppPages;
    }


    @Given("user is on login page of website2")
    public void user_is_on_login_page_of_website2() throws InterruptedException {
        orangeHRMAppPages.openSite();
    }

    @When("user entered {string} and {string} in website2")
    public void user_entered_and_in_website2(String string, String string2) throws InterruptedException {
        System.out.println("User ID and its password values are " + string + " " + string2);
        orangeHRMAppPages.setUserName(string);
        orangeHRMAppPages.setPassword(string2);
    }
    @When("user clicked login button of website2")
    public void user_clicked_login_button_of_website2() {

        orangeHRMAppPages.selectLoginButton();
    }

    @Then("user should logged successfully in website2")
    public void user_should_logged_successfully_in_website2() throws InterruptedException {
        orangeHRMAppPages.loginAssertion();
    }


//
//    @Given("I am on the login page of orangehrm")
//    public void i_am_on_the_login_page_of_orangehrm() {
//        FluentWaitHelper waitHelper = new FluentWaitHelper(genericUtil.getDriver());
//
//        genericUtil.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        waitHelper.waitForElementToBeVisible(By.name("username"), 10);
//        System.out.println("testing the validity of element ==> " + By.name("username").toString());    }
//
//    @When("I enter my username and password in orangehrm")
//    public void i_enter_my_username_and_password_in_orangehrm() {
//        genericUtil.getDriver().findElement(By.name("username")).sendKeys("Admin");
//        genericUtil.getDriver().findElement(By.name("password")).sendKeys("admin123");
//    }
//
//    @When("I click orangehrm login button")
//    public void i_click_orangehrm_login_button() {
//        // Write code here that turns the phrase above into concrete actions
////        driver.findElement(By.xpath("//button[@type='submit' and text()=' Login ']"));
//        genericUtil.getDriver().findElement(By.xpath("//button[@type='submit' and contains(., 'Login')]")).click();
//    }
//
//    @Then("I should be logged in successfully in orangehrm")
//    public void i_should_be_logged_in_successfully_in_orangehrm() {
//        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//        String actualUrl = genericUtil.getDriver().getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
//        genericUtil.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        genericUtil.getDriver().quit();
//    }
}
