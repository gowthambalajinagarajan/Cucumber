package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginApplication(String user,String pass) {
		setText(txtUserName, user);
		setText(txtPassword, pass);
	}
	
	public WebElement getUserName() {
		return txtUserName;
	}
	
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	public WebElement getbtnLogin() {
		return btnLogin;
	}
	public void ClickLogin() {
		btnLogin.click();
	}
	
	public void SetUserName(String user) {
		setText(txtUserName, user);
	}
	
	public String getEnteredText() {
		return txtUserName.getAttribute("value");
	}
}
