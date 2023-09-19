package Stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class Google_Serch_Case {
	
	public static WebDriver driver;
	@Given("enter google with valid URL")
	public void enter_google_with_valid_url() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\eclipse\\Cucumber_Practise\\Server\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
	}

	@Then("search RRR on google searchbar")
	public void search_rrr_on_google_searchbar() throws Throwable {
		
		driver.findElement(By.id("APjFqb")).sendKeys("RRR");
		Thread.sleep(3000);
WebElement ele=	driver.findElement(By.xpath("(//span[text()='RRR']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		
	  
	}

	@Then("click on search button")
	public void click_on_search_button() {
		
	
		System.out.println("bjbjbjbjbjbjbjb");
	    
	}

	@Then("select the first link")
	public void select_the_first_link() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[text()='RRR (film)']")).click();
	    
	}

	@Then("close the browser")
	public void close_the_browser() throws Throwable {
	   
		Thread.sleep(3000);
		driver.quit();
	}

	

}
