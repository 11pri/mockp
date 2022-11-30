package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/VtigerLead.feature" }, 
				glue = {"stepdefinitions", "hooks" }, 
				plugin = { "pretty" }, 
				monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}

// monochrome : console will be displayed in proper format & alignment

// plugin = pretty : report in the console will be displayed in proper format