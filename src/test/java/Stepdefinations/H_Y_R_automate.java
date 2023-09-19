package Stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class H_Y_R_automate {
	
	
	////a[text()='Selenium Practice']
	
	
	public static WebDriver   driver;
	
	@Given("user is enter url")
	public void user_is_enter_url() {
		
		
		String ProjectPath=System.getProperty("user.dir");
		System.out.println(ProjectPath);
		System.setProperty("webdriver.chrome.driver",ProjectPath+"\\Server\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/");
	   
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		
		System.out.println("user is on Homepage right now");
	   
	}

	@Then("user is place on selenium practise")
	public void user_is_place_on_selenium_practise() {
	   
		WebElement ele=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Dropdowns']"));
		act.moveToElement(ele2).click().perform();
		
	}

	@Then("user click on drop downs")
	public void user_click_on_drop_downs() {
		
		System.out.println("User is on dropdown page");
		
		
	   
	}

}
