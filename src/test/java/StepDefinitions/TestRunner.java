package StepDefinitions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
        glue={"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports/HtmlReports.html",
                            "html:target/JsonReports/JsonReports.json",
                            "html:target/JunitReports/XmlReports.xml"}

)
public class TestRunner {
}
