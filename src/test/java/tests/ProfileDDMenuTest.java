package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.MyWorkspacePage;
import pages.ProfileDDMenuPage;

public class ProfileDDMenuTest extends AppTest {
	
	@Test(description = "Am I in a 'Your Profile' page?")
	public void tc01_projectsPageValidation() {
		//ProjectsPage
		MyWorkspacePage mwp = new MyWorkspacePage(driver);
		mwp.closeFeedback();
		ProfileDDMenuPage pdmp = new ProfileDDMenuPage(driver);
		pdmp.profileDD("Your Profile");
		Assert.assertTrue(pdmp.isYourProfilePage());
	}
	
	@Test(description = "Am I in a 'Settings' page?")
	public void tc02_templatesPageValidation() {
		ProfileDDMenuPage pdmp = new ProfileDDMenuPage(driver);
		pdmp.profileDD("Settings");
		Assert.assertTrue(pdmp.isSettingsPage());
	}
	
	@Test(description = "Am I in a 'Plans & Billing' page?")
	public void tc03_templatesPageValidation() {
		ProfileDDMenuPage pdmp = new ProfileDDMenuPage(driver);
		pdmp.profileDD("Plans & Billing");
		Assert.assertTrue(pdmp.isPlansBillingPage());
	}
	
	@Test(description = "Am I in a 'Payment Integrations' page?")
	public void tc04_templatesPageValidation() {
		ProfileDDMenuPage pdmp = new ProfileDDMenuPage(driver);
		pdmp.profileDD2("Payment Integrations");
		Assert.assertTrue(pdmp.isPaymentIntegrationsPage());
	}
	
	@Test(description = "Am I in a 'Manage Domains' page?")
	public void tc05_templatesPageValidation() {
		ProfileDDMenuPage pdmp = new ProfileDDMenuPage(driver);
		pdmp.profileDD("Manage Domains");
		Assert.assertTrue(pdmp.isManageDomainsPage());
	}
	
	@Test(description = "Am I in a 'Custom Fonts' page?")
	public void tc06_templatesPageValidation() {
		ProfileDDMenuPage pdmp = new ProfileDDMenuPage(driver);
		pdmp.profileDD("Custom Fonts");
		Assert.assertTrue(pdmp.isCustomFontsPage());
	}
	
	@Test(description = "Am I in a 'Affiliate Program' page?")
	public void tc07_templatesPageValidation() {
		ProfileDDMenuPage pdmp = new ProfileDDMenuPage(driver);
		pdmp.profileDD("Affiliate Program");
		Assert.assertTrue(pdmp.isAffiliateProgramPage());
	}
	
	@Test(description = "Am I in a 'Support' page?")
	public void tc08_templatesPageValidation() {
		ProfileDDMenuPage pdmp = new ProfileDDMenuPage(driver);
		pdmp.profileDD("Support");
		Assert.assertTrue(pdmp.isSupportPage());
	}
	
	@Test
	public void tc09_logout() {
		ProfileDDMenuPage pdmp = new ProfileDDMenuPage(driver);
		pdmp.logout();
		Assert.assertTrue(pdmp.getLogoutMsg());
	}
}

