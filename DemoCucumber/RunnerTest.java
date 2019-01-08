package com.cucumber.DemoCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"classpath:Feature/Feature1.feature"},
glue={"classpath:com.cucumber.DemoCucumber"},
plugin={"html://target/reports"})

public class RunnerTest extends AbstractTestNGCucumberTests
{
    
}
