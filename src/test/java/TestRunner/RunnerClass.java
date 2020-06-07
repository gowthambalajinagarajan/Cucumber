package TestRunner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import Utility.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/DressPage.feature", glue = "Steps",dryRun=false ,//tags= {"@Regression"},
plugin = {"pretty","html:CucumberHTMLReport/Report"})


/*@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/DressPage.feature", glue = "Steps", dryRun = false, //tags = {"@Sanity,@Regression" },
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/reports.html"})*/

public class RunnerClass {
	/*
	@AfterClass
	public static void writeExtentReport() {

		//Reporter.loadXMLConfig(new File(BasePage.getConfigPath()));
		
	}
*/
	
}
