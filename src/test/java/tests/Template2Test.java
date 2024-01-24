package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyWorkspacePage;
import pages.Template2CustomerSurveyPage;
import pages.TemplatesPage;

public class Template2Test extends AppTest {

	@Test
	public void tc01_template2() {
		// MyWorkspacePage
		MyWorkspacePage mwp = new MyWorkspacePage(driver);
		mwp.closeFeedback();
		mwp.templates();
		// TemplatesPage
		TemplatesPage tp = new TemplatesPage(driver);
		tp.open_closeMainCategory("company department");
		tp.chooseSubCategory("customer success");
		tp.chooseTemplate("customer satisfaction survey");
		// CustomerSatisfactionSurveyTemplate
		Template2CustomerSurveyPage t2csp = new Template2CustomerSurveyPage(driver);
		t2csp.startTemplate();
		t2csp.rateRecommendCompany(2);
		t2csp.next();
		t2csp.rateProducts("reliable");
		t2csp.rateProducts("good value for money");
		t2csp.next();
		t2csp.rateNeeds("somewhat");
		t2csp.rateProductQuality(7);
		t2csp.rateProductValue(5);
		t2csp.rateResponsive(9);
		t2csp.next();
		t2csp.ratePurchaseProducts(3);
		t2csp.periodAsCustomer("this is my first purchase");
		t2csp.writeComments(
				"The app most of the time works quickly and conveniently, but there are certain pages such as \"Saved\" and \"Purchases\" that take a relatively long time to load");
		t2csp.next();
//		t2csp.closeTemplate();
	}

	@Test(description = "Receiving a notification of the completion of the Template")
	public void tc02_CompletionOfTheTemplate() {
		Template2CustomerSurveyPage t2csp = new Template2CustomerSurveyPage(driver);
		String actual = t2csp.getCompletionMsg();
		String expected = "Thank you for the input!";
		Assert.assertEquals(actual, expected);

	}

}