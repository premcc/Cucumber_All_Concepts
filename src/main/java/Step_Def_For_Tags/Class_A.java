package Step_Def_For_Tags;

import io.cucumber.java.en.*;

public class Class_A {
	

@Given("user is on login page now")
public void user_is_on_login_page_now() {
	
	System.out.println("User enters the url and landed on login page");
    
}

@Then("user is on username spot enter the creds")
public void user_is_on_username_spot_enter_the_creds() {
	
	System.out.println("user is enters the username ");
   
}

@Then("user is on password spot and enters the creds")
public void user_is_on_password_spot_and_enters_the_creds() {
   
	System.out.println("user is enters the  password");
}

@Then("user click on login button")
public void user_click_on_login_button() {
	
	System.out.println("User clicks the login button ");
   
}




}
