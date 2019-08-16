 package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
	features="features",
	glue ="com.steps",
	tags = "@test"
	)

public class TestRunner extends AbstractTestNGCucumberTests{

}
