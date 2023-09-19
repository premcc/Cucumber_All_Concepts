package STep_Defi_FOr_Hooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\Hooks_IN_CUCU",glue="STep_Defi_FOr_Hooks",monochrome = true,
plugin = {"pretty","html:target/HookREpo/repo.html"},tags = "@SmokeTest or @Regression")
public class Runner_For_Hooks {

}
