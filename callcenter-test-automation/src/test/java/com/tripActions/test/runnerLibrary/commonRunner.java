package com.tripActions.test.runnerLibrary;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/tripActions/test/application/featuresFiles"},
        glue = {"com.tripActions.test"},
        plugin = { 
                    "pretty",
                    "html:target/cucumber-pretty",
                    "json:target/cucumber.json"
                },
        tags={"@login"},
        monochrome = true
        )

public class commonRunner {}