package runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepdefinitions"},
//monochrome=true,
plugin= {"pretty", "junit:target/JunitReport/junit.xml",
		 "json:target/JSONReports/report.json",
		 "html:target/HtmlReports/report.html"
        }
		)
public class TestRunner {

}
