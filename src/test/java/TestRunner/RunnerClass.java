package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/login.feature", glue = "Steps",dryRun=false,
plugin = {"pretty","junit:CucumberXMLReport/report/cucumber.xml"})
public class RunnerClass {

}
