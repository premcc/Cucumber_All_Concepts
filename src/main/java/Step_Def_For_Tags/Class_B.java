package Step_Def_For_Tags;

import io.cucumber.java.en.*;
public class Class_B {

@Given("user is on Home page now")
public void user_is_on_home_page_now() {
   
	System.out.println("after login the page user enters the home page ");
}

@Then("user is click on logout")
public void user_is_click_on_logout() {
	
	System.out.println("user clicks  the logout  ");
    
}

@Then("user get confirmation message")
public void user_get_confirmation_message() {
	
	System.out.println("user should get confirmation message ");
   
}

@Then("user click Ok and confirm logout")
public void user_click_ok_and_confirm_logout() {
	
	System.out.println("Should able to logout");
   
}


}
