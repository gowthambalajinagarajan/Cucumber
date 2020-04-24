package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement WomenTab;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement DressesTab;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement TShirtTab;
	
	@FindBy(id="newsletter-input")
	private WebElement NewsLetter;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement NewsLetterSubmit;

	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement MsgSuccess;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomenTab() {
		return WomenTab;
	}

	public WebElement getDressesTab() {
		return DressesTab;
	}

	public WebElement getTShirtTab() {
		return TShirtTab;
	}
	
	public void ClickWomen() {
		WomenTab.click();
	}
	
	public void ClickDresses() {
		DressesTab.click();
	}
	
	public void ClickTshirt() {
		TShirtTab.click();
	}
	
	public void SetNewsLetter(String email) {
		setText(NewsLetter, email);
		NewsLetterSubmit.click();
	}
	
	public String getMessage() {
		return MsgSuccess.getText();
	}
}


