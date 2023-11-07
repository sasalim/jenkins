package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions (
		
		features="src/test/resources/features",
		glue= {"steps"},monochrome=true, strict=true,
		tags="@tag1",
		plugin = {"pretty", "json:target/reports/cucumber-report.json",
                "html:target/reports/cucumber.html"}
		)

public class runner {

}
