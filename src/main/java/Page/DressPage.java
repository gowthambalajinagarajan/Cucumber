package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class DressPage extends BasePage{
	
	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement txtHeading;

	@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/li"))
	private List<WebElement> lstProducts;

	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]//*[text()='Add to cart']")
	private WebElement btnFirstAddtoCart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement btnCheckout;
	
	@FindBy(xpath = "//span[@title='Close window']")
	private WebElement btnClose;

	@FindBy(xpath="//a[@title='View my shopping cart']")
	private WebElement Cart;
	
	public DressPage() {
		PageFactory.initElements(driver, this);
	}

	public int getCountFromHeader() {		
		return Integer.parseInt(txtHeading.getText().split(" ")[2]);
	}

	public int getProductsSize() {
		return lstProducts.size();
	}

	public void clickFirstAddToCart() {
		mouseOver(lstProducts.get(0));
		isElementVisible(btnFirstAddtoCart);
		btnFirstAddtoCart.click();
	}
	
	public boolean verifyCheckoutButton(){
		isElementVisible(btnCheckout);
		return elementFound(btnCheckout);
	}
	
	public WebElement getCloseBtn(){
		return btnClose;
	}

	public WebElement getCart() {
		return Cart;
	}
	
	public void ClickCart() {
		Cart.click();
	}
	
	/*public void ClickAddtoCart(String Prod) {
		List<WebElement> products=lstProducts;
		for(WebElement prod:products) {
			String Name=prod.findElement(By.xpath(".//a[@class='product-name']")).getText();
			System.out.println(Name);
			if(Name.equals(Prod)) {
				mouseOver(prod);
				prod.findElement(By.xpath(".//a[@title='Add to cart']")).click();
			}
		}
		*/
		
	public void ClickAddtoCart(String Prod) {
		List<WebElement> products=lstProducts;
		for(WebElement prod:products) {
			String Name=prod.findElement(By.xpath(".//a[@class='product-name']")).getText();
			System.out.println(Name);
			if(Name.equals(Prod)) {
				mouseOver(prod);
				prod.findElement(By.xpath(".//a[@title='Add to cart']")).click();
			}
		}
	}
	}
