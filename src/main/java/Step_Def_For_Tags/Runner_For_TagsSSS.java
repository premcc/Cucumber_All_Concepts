package Step_Def_For_Tags;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\heman\\eclipse\\Cucumber_Practise\\src\\main\\java\\Tags_IN_cucumber",glue = "Step_Def_For_Tags"
,monochrome = true, plugin = {"pretty","html:target/tagsRepo/repo.html"},tags ="@SmokeTest or @SystemTest")
public class Runner_For_TagsSSS {

}
