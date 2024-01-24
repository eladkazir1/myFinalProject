package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AppPage{

	public MainPage(WebDriver driver) {
		super(driver);
	}
	//-------------------------Elements-----------------------------------------------------------------
	
	@FindBy(css="[href='/templates'].py-1")
	private WebElement templatesBtn;
	
	@FindBy(css="#button_tracking-id_login_nav-bar")
	private WebElement loginBtn;
	
	//-------------------------Methods------------------------------------------------------------------
	
	public void templates() {
		click(templatesBtn);
	}
	
	public void chooseLogin() {
		waiting(1000);
		click(loginBtn);
	}

}
