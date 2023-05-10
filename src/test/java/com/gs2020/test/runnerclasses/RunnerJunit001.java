package com.gs2020.test.runnerclasses;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features001",
                        glue = "com.gs2020.test",
                        monochrome = false,
                        tags = "@Test01")
public class RunnerJunit001 {
}
