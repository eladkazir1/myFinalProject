package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuBarPage extends AppPage{

	public TopMenuBarPage(WebDriver driver) {
		super(driver);
	}
	//-------------------------Elements-----------------------------------------------------------------
	
	@FindBy(css=".mr-3.text-xl")
	private WebElement titleLabelProjects;
	
	@FindBy(css=".font-semibold>span:nth-child(1)")
	private WebElement titleLabelTemplates;
	
	@FindBy(css=".bg-white.relative h1")
	private WebElement titleLabelAnalytics;
	
	@FindBy(css="div:nth-child(2) > h2")
	private WebElement titleLabelIntegrations;
	
	@FindBy(css="div:nth-child(3) h1")
	private WebElement titleLabelCoupons;
	
	@FindBy(css="div:nth-child(3) h1")
	private WebElement titleLabelContacts;
	
	
	//-------------------------Methods------------------------------------------------------------------
	
	
	
	//-------------------------Validation---------------------------------------------------------------
	
	public boolean isProjectsPage() {
		if (getText(titleLabelProjects).equalsIgnoreCase("My Workspace")) {
			return true;	
		}
		return false;
	}
	
	public boolean isTemplatesPage() {
		if (getText(titleLabelTemplates).equalsIgnoreCase("Categories")) {
			return true;	
		}
		return false;
	}
	
	public boolean isAnalyticsPage() {
		if (getText(titleLabelAnalytics).equalsIgnoreCase("Organization Analytics")) {
			return true;	
		}
		return false;
	}
	
	public boolean isIntegrationsPage() {
		if (getText(titleLabelIntegrations).equalsIgnoreCase("Native integrations")) {
			return true;	
		}
		return false;
	}
	
	public boolean isCouponsPage() {
		if (getText(titleLabelCoupons).equalsIgnoreCase("Manage Coupon Lists")) {
			return true;	
		}
		return false;
	}
	
	public boolean isContactsPage() {
		if (getText(titleLabelContacts).equalsIgnoreCase("Manage Contacts")) {
			return true;	
		}
		return false;
	}

}
