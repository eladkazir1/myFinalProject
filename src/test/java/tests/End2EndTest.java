package tests;

import org.testng.annotations.Test;
import pages.MyWorkspacePage;
import pages.Template1ArtPieceOrderPage;
import pages.Template2CustomerSurveyPage;
import pages.Template3EyewearQuizPage;
import pages.TemplatesPage;

public class End2EndTest extends AppTest {
	
	@Test
	public void tc01_end2EndTest() {
		MyWorkspacePage mwp = new MyWorkspacePage(driver);
		mwp.closeFeedback();
		mwp.templates();
		//TemplatesPage
		TemplatesPage tp = new TemplatesPage(driver);
		tp.chooseSubCategory("calculate price quotes");
		tp.chooseTemplate("Custom Art Piece Order");
		//ArtPieceOrderTemplate
		Template1ArtPieceOrderPage t1apop = new Template1ArtPieceOrderPage(driver);
		t1apop.startTemplate();
		t1apop.choosePaintingStyle("in full colour");
		t1apop.choosePaintingObject("an animal");
		t1apop.next();
		t1apop.PaintingDescribe("I would like to receive a painting of two monkeys sitting on a tree and eating a banana. One monkey is standard color and the other is pink. Thanks");
		t1apop.next();
		t1apop.choosePaintingFormat("canvas print");
		t1apop.shippingAddress("Elad", "Kazir", "eladkazir@walla.com", "Matalon 22", "38825", "Tel-Aviv");
		t1apop.fillCountry("israel");
		t1apop.closeTemplate();
		//TemplatesPage
		tp.open_closeMainCategory("company department");
		tp.chooseSubCategory("customer success");
		tp.chooseTemplate("customer satisfaction survey");
		//CustomerSatisfactionSurveyTemplate
		Template2CustomerSurveyPage t2csp = new Template2CustomerSurveyPage(driver);
		t2csp.next();
		t2csp.rateRecommendCompany(3);
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
		t2csp.writeComments("The app most of the time works quickly and conveniently, but there are certain pages such as \"Saved\" and \"Purchases\" that take a relatively long time to load");
		t2csp.next();
		t2csp.closeTemplate();
		//TemplatesPage
		tp.open_closeMainCategory("use case");
		tp.chooseSubCategory("recommend products");
		tp.chooseTemplate("shoppable eyewear quiz");
		//EyewearQuizTemplate
		Template3EyewearQuizPage t3eqp = new Template3EyewearQuizPage(driver);
		t3eqp.startTemplate();
		t3eqp.chooseGenderStyle("men's styles");
		t3eqp.chooseFaceWidth("narrow");
		t3eqp.chooseShape("rectangular");
		t3eqp.chooseColor("two-tone");
		t3eqp.chooseMaterials("metal");
		t3eqp.closeTemplate();

	}

}