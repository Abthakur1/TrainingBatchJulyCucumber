package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html: target/cucumber-reports/cucumber.html",
                "json: target/cucumber-reports/cucumber.json"},
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"}   // v. imp --> interview
)

public class QAPracticeTestRunner extends AbstractTestNGCucumberTests {
}
