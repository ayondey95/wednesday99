package stepdefinition125;

import com.demob125.action125.homepageaction125;
import com.demob125.action125.loginpageaction125;
import com.demob125.utility125.base_class125;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login126 extends base_class125 {
	homepageaction125 homepageaction125_1 = new homepageaction125();
	loginpageaction125 loginpageaction125_1 = new loginpageaction125();
	@Given("^Launch application \"([^\"]*)\"$")
	public void launch_application(String URL) throws Throwable {
		getURL(URL);
	}

	@Then("^Click loginlink$")
	public void click_loginlink() throws Throwable {
	   homepageaction125_1.Click_loginlink();
	}

	@Then("^Verify login option display with username and password in login page\\.$")
	public void verify_login_option_display_with_username_and_password_in_login_page() throws Throwable {
	
	}

	@Then("^Enter user name and password and click login$")
	public void enter_user_name_and_password_and_click_login() throws Throwable {
		loginpageaction125_1.UserCredential(prop125.getProperty("username_valid125"), prop125.getProperty("password_valid"));
	}

	@Then("^Verify user Profile Page display with valid username and password\\.$")
	public void verify_user_Profile_Page_display_with_valid_username_and_password() throws Throwable {
	   
	}

	@Then("^Enter invalid username and invalid password and click login$")
	public void enter_invalid_username_and_invalid_password_and_click_login() throws Throwable {
		loginpageaction125_1.UserCredential(prop125.getProperty("username_invalid125"), prop125.getProperty("password_invalid"));
	}

	@Then("^Verify user login not successful with invalid username and password$")
	public void verify_user_login_not_successful_with_invalid_username_and_password() throws Throwable {
	    
	}

	@Then("^Enter invalid username and valid password and click login$")
	public void enter_invalid_username_and_valid_password_and_click_login() throws Throwable {
		loginpageaction125_1.UserCredential(prop125.getProperty("username_invalid125"), prop125.getProperty("password_valid"));
	}

	@Then("^Verify user login not successful with invalid username and valid password$")
	public void verify_user_login_not_successful_with_invalid_username_and_valid_password() throws Throwable {
	    
	}

	@Then("^Enter valid username and invalid password and click login$")
	public void enter_valid_username_and_invalid_password_and_click_login() throws Throwable {
		loginpageaction125_1.UserCredential(prop125.getProperty("username_valid125"), prop125.getProperty("password_invalid"));
	}

	@Then("^Verify user login not successful with valid username and invalid password$")
	public void verify_user_login_not_successful_with_valid_username_and_invalid_password() throws Throwable {
	    
	}

	@Then("^keep username and password filed empty and click login$")
	public void keep_username_and_password_filed_empty_and_click_login() throws Throwable {
		loginpageaction125_1.UserCredential(prop125.getProperty(null), prop125.getProperty(null));
	}

	@Then("^Verify user wont be able to login without username and password$")
	public void verify_user_wont_be_able_to_login_without_username_and_password() throws Throwable {
	   
	}

	@Then("^enter password and click login$")
	public void enter_password_and_click_login() throws Throwable {
		loginpageaction125_1.UserCredential(prop125.getProperty(null), prop125.getProperty("password_valid"));
	}

	@Then("^Verify user wont be able to login without username$")
	public void verify_user_wont_be_able_to_login_without_username() throws Throwable {
	   
	}

	@Then("^enter username and click login$")
	public void enter_username_and_click_login() throws Throwable {
		loginpageaction125_1.UserCredential(prop125.getProperty("username_valid125"), prop125.getProperty(null));
	}

	@Then("^Verify user wont be able to login without password$")
	public void verify_user_wont_be_able_to_login_without_password() throws Throwable {
	    
	}

}
