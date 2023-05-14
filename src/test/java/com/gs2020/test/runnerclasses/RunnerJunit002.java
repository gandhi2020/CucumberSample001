package com.gs2020.test.runnerclasses;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features001",
                    tags = "@test01",
                    glue = "com.gs2020.test",
                    plugin = {"pretty",
                                "summary",
                                "json:target/cucumber-reports.json",
                                "html:target/cucumber-reports.html",
                                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                            },
                    monochrome = false
                )
public class RunnerJunit002 {

}
