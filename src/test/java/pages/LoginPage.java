package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	// -------------------------Elements-----------------------------------------------------------------

	@FindBy(css = "[type='email']")
	private WebElement emailAdressField;

	@FindBy(css = "[type='password']")
	private WebElement passwordField;

	@FindBy(css = "[type='submit'] div")
	private WebElement submitBtn;

	@FindBy(css = ".ml-0")
	private WebElement errorLabel;

	// -------------------------Methods------------------------------------------------------------------

	public void login(String email, String password) {
		fillText(emailAdressField, email);
		fillText(passwordField, password);
		click(submitBtn);
	}

	// -------------------------Validation---------------------------------------------------------------
	public String getErrMsg() {
		waiting(1000);
		return getText(errorLabel);
	}

}
