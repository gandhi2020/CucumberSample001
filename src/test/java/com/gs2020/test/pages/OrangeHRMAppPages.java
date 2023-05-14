package com.gs2020.test.pages;

import com.gs2020.test.utilities.FluentWaitHelper;
import com.gs2020.test.utilities.GenericUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMAppPages {
    GenericUtil genericUtil;
    FluentWaitHelper waitHelper;

    public OrangeHRMAppPages(GenericUtil genericUtil){
        this.genericUtil = genericUtil;
        PageFactory.initElements(genericUtil.getDriver(), this);
        waitHelper = new FluentWaitHelper(genericUtil.getDriver());
    }

//    @FindBy(name = "username")
    @FindBy(xpath = "//input[@name='username']")
    private WebElement userNameOfAppPage;

//    @FindBy(name = "password")
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordOfAppPage;

    @FindBy(xpath = "//button[@type='submit' and contains(., 'Login')]")
    private WebElement loginBtnOfAppPage;

    public void openSite() throws InterruptedException {
        genericUtil.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        waitHelper.waitForElementToBeVisible(By.name("username"), 10);
//        Thread.sleep(3000);
        System.out.println("OrangeHRM login page loaded successfully");
    }

    public void setUserName(String userName) throws InterruptedException {
        System.out.println("value of Field username in HRM app " + userName);
        Thread.sleep(3000);
        userNameOfAppPage.sendKeys(userName);
//        genericUtil.getDriver().findElement(By.name("username")).sendKeys("userName");
    }

    public void setPassword(String password){
        System.out.println("value of Field password in HRM app " + password);
        passwordOfAppPage.sendKeys(password);
//        genericUtil.getDriver().findElement(By.name("password")).sendKeys("password");
    }

    public void selectLoginButton() {
        loginBtnOfAppPage.click();
//        genericUtil.getDriver().findElement(By.xpath("//button[@type='submit' and contains(., 'Login')]")).click();
    }

    public void loginAssertion() throws InterruptedException {
        Thread.sleep(3000);
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualUrl = genericUtil.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
