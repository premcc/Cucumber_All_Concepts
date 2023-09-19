package STep_Defi_FOr_Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_For_Hooks {

	public WebDriver driver;

	public Pom_For_Hooks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "firstname")
	private WebElement firstname;

	@FindBy(name = "lastname")
	private WebElement lastname;
	@FindBy(name = "sex")
	private WebElement sex;
	@FindBy(id = "exp-3")
	private WebElement exp_3;
	@FindBy(id = "datepicker")
	private WebElement datepicker;
	@FindBy(id = "profession-1")
	private WebElement profession;
	@FindBy(id = "tool-2")
	private WebElement tool;
	@FindBy(id = "continents")
	private WebElement continents;
	@FindBy(id = "photo")
	private WebElement photo;
	@FindBy(id = "submit")
	private WebElement submit;

	// C:\Users\heman\Downloads\API.txt

	public WebElement firstname() {
		return firstname;
	}

	public WebElement lastname() {
		return lastname;
	}

	public WebElement sex() {
		return sex;
	}

	public WebElement exp() {
		return exp_3;
	}

	public WebElement datepicker() {
		return datepicker;
	}

	public WebElement profession() {
		return profession;
	}

	public WebElement tool() {
		return tool;
	}

	public WebElement continents() {
		return continents;
	}

	public WebElement photo() {
		return photo;
	}

	public WebElement submit() {
		return submit;
	}

}
