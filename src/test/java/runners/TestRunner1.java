package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature/ApolloSearch.feature",
        glue = "stepdefinitions",
        plugin = {"pretty"},
        monochrome = true
)
public class TestRunner1 extends AbstractTestNGCucumberTests {

}
