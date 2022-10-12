package com.demob125.testrunner125;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.demob125.utility125.base_class125;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources125/features125"} , 
plugin = {"json:target/cucumber.json"},
glue = "stepdefinition125")//, tags= {"@test1"})

public class testrunner125 extends AbstractTestNGCucumberTests{
@BeforeTest
	public void startURL() {
	base_class125 starttest125 = new base_class125();
	starttest125.initiBrowser();
	
	
}
@AfterTest
public void closeURL () {
	base_class125 closetest125 = new base_class125();
	closetest125.driver.quit();
	
}
}
