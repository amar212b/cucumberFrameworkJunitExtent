package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
@RunWith(Cucumber.class)
@CucumberOptions(features="target/failed_scenarios.txt",glue = "stepDefinitions",monochrome=true,dryRun = false,
				 plugin = {"pretty","html:target/cucumber.html",
						   "json:target/cucumber.json",
						   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class FailedTestRunnerTest {
	
}
