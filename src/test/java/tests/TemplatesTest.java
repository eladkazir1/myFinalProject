package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.MyWorkspacePage;
import pages.TemplatesPage;

public class TemplatesTest extends AppTest {

	@Test(description = "Am I in a templates page?")
	public void tc01_templatesPageValidation() {
		MyWorkspacePage mwp = new MyWorkspacePage(driver);
		mwp.closeFeedback();
		mwp.templates();
		// TemplatesPage
		TemplatesPage tp = new TemplatesPage(driver);
		Assert.assertTrue(tp.isTemplatesPage());

	}

	@Test
	public void tc02_CheckNumberOfTemplates() {
		TemplatesPage tp = new TemplatesPage(driver);
		tp.chooseSubCategory("collect customer requests");
		Assert.assertEquals(tp.getTemplatesNumber(), tp.getBlocksNumber() - 1);
	}

	@Test
	public void tc03_CheckNumberOfTemplates() {
		TemplatesPage tp = new TemplatesPage(driver);
		tp.open_closeMainCategory("industry");
		tp.chooseSubCategory("events");
		Assert.assertEquals(tp.getTemplatesNumber(), tp.getBlocksNumber() - 1);
	}

	@Test
	public void tc04_CheckNumberOfTemplates() {
		TemplatesPage tp = new TemplatesPage(driver);
		tp.open_closeMainCategory("company department");
		tp.chooseSubCategory("product");
		Assert.assertEquals(tp.getTemplatesNumber(), tp.getBlocksNumber() - 1);
	}

	@Test
	public void tc05_CheckNumberOfTemplates() {
		TemplatesPage tp = new TemplatesPage(driver);
		tp.open_closeMainCategory("application type");
		tp.chooseSubCategory("linklist");
		Assert.assertEquals(tp.getTemplatesNumber(), tp.getBlocksNumber() - 1);
	}

}
