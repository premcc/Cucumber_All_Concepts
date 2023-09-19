package StepDEfinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class FacebookLogin {
	
	public static WebDriver driver;
	@Given("user is on login page22")
	public void user_is_on_login_page() {
		String projectPath=System.getProperty("user.dir");
		driver=WebDriverManager.ChromeDriver().avoidShudownHooks().create();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}

	@Then("he enters {string} and {string}")
	public void he_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
	}

	@Then("click on login button")
	public void click_on_login_button() throws Throwable {
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(40000);
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(40000);
		driver.quit();
		
	   
	}




}
