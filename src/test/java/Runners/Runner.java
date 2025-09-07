package Runners;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/Features",
glue={"StepDefinitions","hooks"},
plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
 
"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},
 
dryRun = false,
monochrome = true,
tags="@Smoke"
)
 
public class Runner {
 
}