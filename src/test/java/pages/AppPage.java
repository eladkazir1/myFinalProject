package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppPage extends BasePage {

	public AppPage(WebDriver driver) {
		super(driver);
	}
	// -------------------------Elements-----------------------------------------------------------------

	@FindBy(css = "[href='https://app.involve.me/projects']")
	private WebElement projectsBtn;

	@FindBy(css = "[href='https://app.involve.me/templates']")
	private WebElement templatesBtn;

	@FindBy(css = "[href='https://app.involve.me/analytics']")
	private WebElement analyticsBtn;

	@FindBy(css = "[href='https://app.involve.me/integrations']")
	private WebElement integrationsBtn;

	@FindBy(css = "[href='https://app.involve.me/coupon-lists']")
	private WebElement couponsBtn;

	@FindBy(css = "[href='https://app.involve.me/contacts']")
	private WebElement contactsBtn;

	@FindBy(css = ".c-button.btn")
	private WebElement nextBtn;

	@FindBy(css = "#cookiescript_close[role='button']")
	private WebElement closeCookiesBtn;

	@FindBy(css = "#cookiescript_accept[role='button']")
	private WebElement acceptCookiesBtn;

	@FindBy(css = ".c-button.btn")
	private WebElement startTemplateBtn;

	@FindBy(css = ".c-button-group-button.e-close")
	private WebElement closeTemplateBtn;

	// -------------------------Methods------------------------------------------------------------------

	public void projects() {
		click(projectsBtn);
	}

	public void templates() {
		click(templatesBtn);
	}

	public void analytics() {
		click(analyticsBtn);
	}

	public void integrations() {
		click(integrationsBtn);
	}

	public void coupons() {
		click(couponsBtn);
	}

	public void contacts() {
		click(contactsBtn);
	}

	public void next() {
		waiting(1000);
		click(nextBtn);
	}

	public void closeCookies() {
		waiting(1000);
		click(closeCookiesBtn);
	}

	public void acceptCookies() {
		waiting(1000);
		click(acceptCookiesBtn);
	}

	public void startTemplate() {
		waiting(1000);
		click(startTemplateBtn);
	}

	public void closeTemplate() {
		click(closeTemplateBtn);
	}

}
