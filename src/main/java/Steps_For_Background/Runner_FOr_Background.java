package Steps_For_Background;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Background/Background.feature" ,glue = "Step_Definitions",monochrome = false,
plugin = {"pretty","html:target/BackgroundRepo/repo.html"})
public class Runner_FOr_Background {

}
