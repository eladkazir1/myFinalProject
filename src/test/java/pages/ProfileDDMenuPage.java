package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileDDMenuPage extends AppPage {

	public ProfileDDMenuPage(WebDriver driver) {
		super(driver);
	}
	// -------------------------Elements-----------------------------------------------------------------

	@FindBy(css = "#nav-dropdown")
	private WebElement profileDD;

	@FindBy(css = "[href='https://app.involve.me/logout']")
	private WebElement logoutBtn;

	// Labels
	@FindBy(css = "#account-profile div > h1")
	private WebElement titleLabelYourProfile;

	@FindBy(css = "#edit-organization div > h1")
	private WebElement titleLabelSettings;

	@FindBy(css = ".e-title")
	private WebElement titleLabelPlansBilling;

	@FindBy(css = ".text-2xl.font-medium.text-gray-900")
	private WebElement titleLabelPaymentIntegrations;

	@FindBy(css = "#app div > h1")
	private WebElement titleLabelManageDomains;

	@FindBy(css = "#app div > h1")
	private WebElement titleLabelCustomFonts;

	@FindBy(css = "#app div > h1")
	private WebElement titleLabelAffiliateProgram;

	@FindBy(css = "#app div > h1")
	private WebElement titleLabelSupport;

	@FindBy(css = "#v-app h2")
	private WebElement logoutMsg;

	// -------------------------Methods------------------------------------------------------------------

	public void profileDD(String name) {
		waiting(2000);
		click(profileDD);
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector("div.flex > div > ul > li"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector(".dropdown-item"));
			if (getText(titleEl).equalsIgnoreCase(name)) {
				click(titleEl);
				break;
			}
		}
	}

	public void profileDD2(String name) {// משתנה ובהתאם גם הסלקטור של הקטגוריות DD התצוגה של תפריט "Plans & Billing"
											// באג באתר: רק בדף
		waiting(2000);
		click(profileDD);
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector("li.nav-item.dropdown.show > ul > li"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector(".dropdown-item"));
			if (getText(titleEl).equalsIgnoreCase(name)) {
				click(titleEl);
				break;
			}
		}
	}

	public void logout() {
		waiting(2000);
		click(profileDD);
		click(logoutBtn);
	}

	// -------------------------Validation---------------------------------------------------------------

	public boolean isYourProfilePage() {
		if (getText(titleLabelYourProfile).equalsIgnoreCase("Profile")) {
			return true;
		}
		return false;
	}

	public boolean isSettingsPage() {
		if (getText(titleLabelSettings).equalsIgnoreCase("Organization Info")) {
			return true;
		}
		return false;
	}

	public boolean isPlansBillingPage() {
		if (getText(titleLabelPlansBilling).equalsIgnoreCase("Plans & Billing")) {
			return true;
		}
		return false;
	}

	public boolean isPaymentIntegrationsPage() {
		if (getText(titleLabelPaymentIntegrations).equalsIgnoreCase("Payment Integration Accounts")) {
			return true;
		}
		return false;
	}

	public boolean isManageDomainsPage() {
		if (getText(titleLabelManageDomains).equalsIgnoreCase("Manage Domains")) {
			return true;
		}
		return false;
	}

	public boolean isCustomFontsPage() {
		if (getText(titleLabelCustomFonts).equalsIgnoreCase("Manage Custom Fonts")) {
			return true;
		}
		return false;
	}

	public boolean isAffiliateProgramPage() {
		if (getText(titleLabelAffiliateProgram).equalsIgnoreCase("Affiliate Program")) {
			return true;
		}
		return false;
	}

	public boolean isSupportPage() {
		if (getText(titleLabelSupport).equalsIgnoreCase("Support Center")) {
			return true;
		}
		return false;
	}

	public boolean getLogoutMsg() {
		if (getText(logoutMsg).equalsIgnoreCase("Sign in to your account")) {
			return true;
		}
		return false;
	}

}
