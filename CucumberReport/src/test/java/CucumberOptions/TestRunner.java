package CucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/FlightBooking.feature", glue={"StepDefinitions"},
plugin = { "pretty","html:target/cucumber-reports"},tags ={})
 
public class TestRunner 
{
}
