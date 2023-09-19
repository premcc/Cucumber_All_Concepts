package Steps_For_Background;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import STep_Defi_FOr_Hooks.Pom_For_Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
public class Background_Class {

	public static  WebDriver driver;
	@Before(order = 0)
	public void setUp()
	{
		String projectPath=System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",projectPath+"//Server//chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	@Given("User should enter the orange hrm page")
	public void user_should_enter_the_orange_hrm_page() {

		System.out.println("user is landed on orange hrm");
	}

	@Then("user enter   usernam and  pass")
	public void user_enter_and() {

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");


	}

	@Then("user clicks the Log btn")
	public void user_clicks_the_log_btn() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

	@Then("user is navigate to OrangeHrm Home page")
	public void user_is_navigate_to_orange_hrm_home_page() {

		System.out.println("User is landed in Homepage");

	}
	@Then("check admin feature is visible or not")
	public void check_admin_feature_is_visible_or_not() {
		boolean value=  driver.findElement(By.xpath("//span[text()='Admin']")).isDisplayed();
		Assert.assertTrue(value);
	}

	@Then("verify logout is visible or not")
	public void verify_logout_is_visible_or_not() {
		driver.findElement(By.xpath("//p[text()='Paul Collings']")).click();

		driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();

	}



	@After(order = 1)
	public void tearPage()
	{
		driver.quit();
	}



}
