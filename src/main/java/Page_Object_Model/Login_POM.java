package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {

	public WebDriver driver;

	public Login_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "twotabsearchtextbox")
	 WebElement flipSearcgBar;
	@FindBy(id = "nav-search-submit-button")
	 WebElement flipSerchbtn;
	@FindBy(xpath = "//a[text()='Amazon miniTV']")
	WebElement miniTV;
 
	 public WebElement flipSearcgBar()
	 {
		return flipSearcgBar;
		 
	 }
	 public WebElement flipSerchbtn()
	 {
		return flipSerchbtn;
		 
	 }
	 public WebElement miniTV()
	 {
		return miniTV;
		 
	 }
	 
}
