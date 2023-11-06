package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions (
		
		features="src/test/resources/features",
		glue= {"steps"},monochrome=true, strict=true,
		tags="@tag2")

public class runner {

}