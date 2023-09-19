package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/HYR.feature",glue = "Stepdefinations",
monochrome = true ,plugin = {"pretty","html:target/HYRRepo/repo.html"})

public class Runner_For_HYR {
	
	

}
