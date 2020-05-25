package Steps;

import java.util.Random;

import org.junit.Assert;

import Page.HomePage;
import Utility.BasePage;
import cucumber.api.java.en.*;

public class HomePageTest {
	
	BasePage bp;
	HomePage hp;
	
	int random=new Random().nextInt(50000);
	String email="gowthambalaji18"+random+"@gmail.com";
	
	public HomePageTest() {
		bp=new BasePage();
		hp=new HomePage();
	}
	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
	    hp=new HomePage();
	}

	@When("^User enter email \"(.*?)\" in the subscription text box$")
	public void user_enter_email_in_the_subscription_text_box(String arg1) throws Throwable {
	    hp.SetNewsLetter(email);
	}

	@Then("^User should see subscription Message$")
	public void user_should_see_subscription_Message() throws Throwable {
	    Assert.assertTrue("Failed", hp.getMessage().contains("successfully"));
	}

	@When("^User Click on the tab \"(.*?)\"$")
	public void user_Click_on_the_tab(String tab) throws Throwable {
	    if(tab.equals("WOMEN")) {
	    	System.out.println(hp.getWomenTab().getText());
	    	hp.ClickWomen();
	    }
	    else if(tab.equals("DRESSES")) {
	    	System.out.println(hp.getDressesTab().getText());
	    	hp.ClickDresses();
	    }
	    else {
	    	System.out.println(hp.getTShirtTab().getText());
	    	hp.ClickTshirt();
	    }
	}

	@Then("^User should see the respective details page$")
	public void user_should_see_the_respective_details_page() throws Throwable {
	 if(hp.getWomenTab().getText().equals("WOMEN")) {
		 System.out.println(hp.getURL());
		Assert.assertTrue("Failed", hp.getURL().contains("id_category=3")); 
	 }
	 else if(hp.getDressesTab().getText().equals("DRESSES")) {
		 System.out.println(hp.getURL());
		 Assert.assertTrue("Failed", hp.getURL().contains("id_category=8"));
	 }
	 else {
		 System.out.println(hp.getURL());
		 Assert.assertTrue("Failed", hp.getURL().contains("id_category=5"));
	 }
	}
}

