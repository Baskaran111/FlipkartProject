package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Cucumber4PM\\src\\test\\resources\\Features\\login.feature", glue = "stepDefinition"
, monochrome = true, dryRun = true, tags = "~@smoketesting or @sanityTesting or @RegressionTesting", plugin = {"usage"
, "json:target/report.json"})
public class Runner {

}
