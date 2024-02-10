package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/tag.feature",glue={"StepDefinitions"},tags= {"@SmokeTest, @RegressionTest"}

				
)
public class TestRunnerclass {

}