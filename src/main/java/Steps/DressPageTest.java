package Steps;

import java.io.IOException;

import org.junit.Assert;

import Page.DressPage;
import Page.HomePage;
import Utility.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class DressPageTest {
	
	BasePage bp;
	HomePage hp;
	DressPage dp;
	
	public DressPageTest() {
		bp=new BasePage();
		hp=new HomePage();
		dp=new DressPage();
	}
	
	@Before
	public void Setup() {
		System.out.println("Before Hook");
	}
	
	@After
	public void tearDown(Scenario sc) throws IOException {
		if(sc.isFailed()) {
			String Name=sc.getName();
			dp.getSnapShot("target","Failed");
			}
	}
	
	@Given("^User lanuch the application$")
	public void user_lanuch_the_application() throws Throwable {
	   dp=new DressPage();
	}

	@Then("^User should see the same number of products count matching with the product header count displayed$")
	public void user_should_see_the_same_number_of_products_count_matching_with_the_product_header_count_displayed() throws Throwable {
	    int a=dp.getCountFromHeader();
	    System.out.println("Header Count:"+a);
	    int b=dp.getProductsSize();
	    System.out.println("Product Count:"+b);
	    Assert.assertEquals(a, b);
	  //  dp.clickFirstAddToCart();
	}

	@And("^the click on Add to cart button for the product \"(.*?)\"$")
	public void the_click_on_Add_to_cart_button_for_the_product(String Prod) throws Throwable {
	    dp.ClickAddtoCart(Prod);
	}

	@Then("^the product should added to cart page$")
	public void the_product_should_added_to_cart_page() throws Throwable {
	   dp.verifyCheckoutButton();
	   dp.getCloseBtn().click();
	   dp.ClickCart();
	}
}
