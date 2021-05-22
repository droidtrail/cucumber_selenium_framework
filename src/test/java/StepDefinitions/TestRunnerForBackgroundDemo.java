package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/BackgroundDemo/BackgroundDemo.feature",
        glue={"StepsForBackground"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports/HtmlReports.html",
                "html:target/JsonReports/JsonReports.json",
                "html:target/JunitReports/XmlReports.xml"}
)

public class TestRunnerForBackgroundDemo {

}
