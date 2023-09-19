package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",glue = { "Step_Definitions"},monochrome = true,plugin= {"pretty", "html:target/HTMLREPO/repo.html","json:taget/JSONREPO/repo.json","junit:target/XMLREPo/report.xml"})

public class Test_Runner_CLass {
	
	
	
}
