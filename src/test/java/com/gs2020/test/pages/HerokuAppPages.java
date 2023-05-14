package com.gs2020.test.pages;

import com.gs2020.test.utilities.GenericUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppPages {
    GenericUtil genericUtil;

    public HerokuAppPages(GenericUtil genericUtil){

        this.genericUtil = genericUtil;
        PageFactory.initElements(genericUtil.getDriver(), this);
    }

    @FindBy(id = "username")
    private WebElement userNameOfAppPage;

    @FindBy(id = "password")
    private WebElement passwordOfAppPage;

    @FindBy(className = "radius")
    private WebElement loginBtnOfAppPage;


    public void openWebSite(){
        genericUtil.getDriver().get("https://the-internet.herokuapp.com/login");
    }

    public void setUserName(String userName){
        userNameOfAppPage.sendKeys(userName);
    }

    public void setPassword(String password){
        passwordOfAppPage.sendKeys(password);
    }

    public void selectLoginButton(){
        loginBtnOfAppPage.click();
    }

    public void loginAssertion() throws InterruptedException {
        Thread.sleep(3000);
        String expectedUrl = "https://the-internet.herokuapp.com/secure";
        String actualUrl = genericUtil.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
