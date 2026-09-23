package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature/Address.feature",
        glue = "stepdefinitions",
        plugin = {"pretty"},
        monochrome = true
)
public class TestRunner2 extends AbstractTestNGCucumberTests {

}
