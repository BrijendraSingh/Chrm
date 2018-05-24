package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue="stepdefinition", 
		tags="@Test_gnews", 
		features="."
		)
public class Runner {

}
