package STep_Defi_FOr_Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
public class Url_Check {
	
	public static  WebDriver driver;
	
	public Pom_For_Hooks ph;
	
	@Before(order = 0)
	public void setUp()
	{
		
String projectPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"//Server//chromedriver.exe");
		
		driver=new ChromeDriver();
		ph=new Pom_For_Hooks(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	}
	
	@Given("user is able to open Techlistic Automation Practice Form App with url")
	public void user_is_able_to_open_techlistic_automation_practice_form_app_with_url() {
		
		System.out.println("User is entering the Page");
	   
	}

	@Then("user do some action")
	public void user_do_some_action() {
		
		System.out.println("Url is perfecrtly alright");
	   
	}

	

	@Then("user is able to fill the all details")
	public void user_is_able_to_fill_the_all_details() throws Throwable {
		
		ph.firstname().sendKeys("uppalbalu");
		Thread.sleep(2000);
		ph.lastname().sendKeys("tiktokchukka");
		Thread.sleep(2000);
		ph.sex().click();
		Thread.sleep(2000);
		ph.exp().click();
		Thread.sleep(2000);
		ph.datepicker().sendKeys("12/23/1600");
		Thread.sleep(2000);
		ph.profession().click();
		Thread.sleep(2000);
		ph.tool().click();
		Thread.sleep(2000);
		
	  
	}

	@Then("user is able to submit")
	public void user_is_able_to_submit() {
		
		System.out.println("Able to enter sub,it");
	}

	@After(order = 1)
	public void tearDown() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}



}
