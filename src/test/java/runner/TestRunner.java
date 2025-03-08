package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Login.feature", glue = "stepDefinitions", dryRun = false, publish = true, plugin = {
		"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json" }, monochrome = true)

public class TestRunner {

}
