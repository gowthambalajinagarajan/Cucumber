package Steps;

import org.junit.Assert;

import Page.LoginPage;
import Utility.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import java.util.List;

public class LoginTest {
	
	BasePage bp;
	LoginPage lp;

	public LoginTest() {
		bp=new BasePage();
		lp=new LoginPage();
	}
	
	@Given("^User has to launch the Application$")
	public void user_has_to_launch_the_Application() throws Throwable {
	   lp=new LoginPage();
	}

	/*@When("^User enter the value username and password$")
	public void user_enter_the_value_username_and_password() throws Throwable {
	
	}*/
	
	@When("^User enter the value \"(.*?)\" and \"(.*?)\" in Login Page$")
	public void user_enter_the_value_and_in_Login_Page(String arg1, String arg2) throws Throwable {
	  lp.getUserName().sendKeys(arg1);
	  lp.getPassword().sendKeys(arg2);
	}

	@And("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
	    lp.ClickLogin();
	}

	@Then("^User should logged into the application$")
	public void user_should_logged_into_the_application() throws Throwable {
	    Assert.assertTrue("Failed",lp.getURL().contains("SearchHotel"));
	}
	
	/*@When("^User enter the value username and password in Login Page$")
	public void user_enter_the_value_username_and_password_in_Login_Page(DataTable table) throws Throwable {
		List<List<String>> data=table.raw();
			for(int i=0;i<data.size();i++) {
				lp.LoginApplication(data.get(i).get(0), data.get(i).get(1));
			}
	}*/
}