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

	@When("^User enter the value username and password$")
	public void user_enter_the_value_username_and_password() throws Throwable {
	 lp.getUserName().sendKeys("gowthambala");
	 lp.getTxtPassword().sendKeys("balaji18");
	}

	@When("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
	    lp.ClickLogin();
	}

	@Then("^User should logged into the application$")
	public void user_should_logged_into_the_application() throws Throwable {
	    Assert.assertTrue("Failed:Login failed",lp.getURL().contains("HotelApp"));
	}
	
	@When("^User enter the value username and password in Login Page$")
	public void user_enter_the_value_username_and_password_in_Login_Page(DataTable table) throws Throwable {
		List<List<String>> datas=table.raw();
		for(int i=0;i<datas.size();i++) {
			lp.LoginApplication(datas.get(i).get(0), datas.get(i).get(1));
		}
	}
}
