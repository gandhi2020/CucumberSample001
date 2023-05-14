package com.gs2020.test.utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.server.DefaultDriverFactory;

public class GenericUtil {

    private static WebDriver driver;

    public GenericUtil() {
    }

    @Before()
    public void setup() throws InterruptedException {
        String browser = "chrome";
        if (browser.equalsIgnoreCase("chrome")){
            Thread.sleep(2000);
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }
    }

    @After()
    public void teardown(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
