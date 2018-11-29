package Cucumber1.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions (
	
	features = {"src/test/java/Cucumber1/featureFiles"},
			glue = {"Cucumber1.stepFiles"},
			monochrome = true, // helps to make the errors on the console output window more readable
			plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json",
					"com.cucumber.listener.ExtentCucumberFormatter.target/report.html"}
)

public class MainRunner {

}
