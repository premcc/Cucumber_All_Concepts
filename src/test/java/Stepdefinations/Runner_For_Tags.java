package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/HYR.feature",glue = "Step_Def_For_Tag",
plugin = "html:TagsRepo/Tags/repo.html")
public class Runner_For_Tags {

}
