package Step_Def_For_Tags;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.java.en.*;


public class Class_D {
	@Given("user is on Home_ page now")
	public void user_is_on_home_page_now() {
		
		System.out.println("User enters the home page ");
	   
	}

	@Then("user is clciks on inbox button")
	public void user_is_clciks_on_inbox_button() {
		
		System.out.println("User able to click the inbox btn");
	   
	}

	@Then("user should delete the frst mail")
	public void user_should_delete_the_frst_mail() {
		
		System.out.println("User should delete the first mail");
	  
	}

	@Then("user is go to the trash and check the deleted mail must visible")
	public void user_is_go_to_the_trash_and_check_the_deleted_mail_must_visible() {
		
		System.out.println("User Should go  the trash and check the deleted mail must visible");
	   
	}


}
