package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.MyWorkspacePage;
import pages.TopMenuBarPage;

public class TopMenuBarTest extends AppTest {
	
	@Test(description = "Am I in a 'Projects' page?")
	public void tc01_projectsPageValidation() {
		//ProjectsPage
		MyWorkspacePage mwp = new MyWorkspacePage(driver);
		mwp.closeFeedback();
		TopMenuBarPage tmbp = new TopMenuBarPage(driver);
		Assert.assertTrue(tmbp.isProjectsPage());
	}
	
	@Test(description = "Am I in a 'Templates' page?")
	public void tc02_templatesPageValidation() {
		TopMenuBarPage tmbp = new TopMenuBarPage(driver);
		tmbp.templates();
		Assert.assertTrue(tmbp.isTemplatesPage());
		
	}
	
	@Test(description = "Am I in a 'Analytics' page?")
	public void tc03_analyticsPageValidation() {
		TopMenuBarPage tmbp = new TopMenuBarPage(driver);
		tmbp.analytics();
		Assert.assertTrue(tmbp.isAnalyticsPage());
		
	}
	
	@Test(description = "Am I in a 'Integrations' page?")
	public void tc04_integrationsPageValidation() {
		TopMenuBarPage tmbp = new TopMenuBarPage(driver);
		tmbp.integrations();
		Assert.assertTrue(tmbp.isIntegrationsPage());
	}
	
	@Test(description = "Am I in a 'Couopns' page?")
	public void tc05_couopnsPageValidation() {
		TopMenuBarPage tmbp = new TopMenuBarPage(driver);
		tmbp.coupons();
		Assert.assertTrue(tmbp.isCouponsPage());
	}
	
	@Test(description = "Am I in a 'Contacts' page?")
	public void tc06_contactsPageValidation() {
		TopMenuBarPage tmbp = new TopMenuBarPage(driver);
		tmbp.contacts();
		Assert.assertTrue(tmbp.isContactsPage());
	}
	
}

