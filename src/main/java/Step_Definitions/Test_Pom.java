package Step_Definitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Object_Model.Login_POM;
import io.cucumber.java.en.*;

public class Test_Pom {
	
	public static WebDriver driver;
	public Login_POM lp;
	@Given("user is on amazon login page22")
	public void user_is_on_amazon_login_page() {
        String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"//Server//chromedriver.exe");
		driver=new ChromeDriver();
		lp=new Login_POM(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	   
	}

	@Then("user is on serch the item")
	public void user_is_on_serch_the_item() throws Throwable {
		
		lp.flipSearcgBar().sendKeys("Samsung");
		Thread.sleep(3000);
		
			
	   
	}

	@Then("user is click search bar")
	public void user_is_click_search_bar() {
		lp.flipSerchbtn().click();
	  
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		
		driver.quit();
	   
	}


}
