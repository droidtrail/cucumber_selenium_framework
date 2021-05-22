package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureWithTags",
        glue={"StepDefinitions"},
        tags = ("@mustRun")
)
public class TestRunner_RunWithSingleTag {
}
