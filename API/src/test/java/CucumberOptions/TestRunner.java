package CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/MyApi.feature", glue= {"StepDefinitions"} )
public class TestRunner 
{
}
