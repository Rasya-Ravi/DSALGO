package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "C:\\Users\\Rasya Ravi\\eclipse-workspace\\dsAlgo\\src\\test\\resources\\Features",
		glue = "stepDefenitions" ,
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/HtmlReports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		//tags= "@smoke and @test"		
		)			

public class TestRun {

}
