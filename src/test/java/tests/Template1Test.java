package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyWorkspacePage;
import pages.Template1ArtPieceOrderPage;
import pages.TemplatesPage;

public class Template1Test extends AppTest {

	@Test
	public void tc01_template1() {
        //MyWorkspacePage
		MyWorkspacePage mwp = new MyWorkspacePage(driver);
		mwp.closeFeedback();
		mwp.templates();
		//TemplatesPage
		TemplatesPage tp = new TemplatesPage(driver);
		tp.chooseSubCategory("calculate price quotes");
		tp.chooseTemplate("Custom Art Piece Order");
		// ArtPieceOrderTemplate
		Template1ArtPieceOrderPage t1apop = new Template1ArtPieceOrderPage(driver);
		t1apop.startTemplate();
		t1apop.choosePaintingStyle("in full colour");
		t1apop.choosePaintingObject("an animal");
		t1apop.next();
		t1apop.PaintingDescribe(
				"I would like to receive a painting of two monkeys sitting on a tree and eating a banana. One monkey is standard color and the other is pink. Thanks");
		t1apop.next();
		t1apop.choosePaintingFormat("canvas print");
		t1apop.shippingAddress("Elad", "Kazir", "eladkazir@walla.com", "Matalon 22", "38825", "Tel-Aviv");
		t1apop.fillCountry("israel");
		t1apop.next();
	}

	@Test(description = "Receiving a notification of the completion of the Template")
	public void tc02_CompletionOfTheTemplate() {
		Template1ArtPieceOrderPage t1apop = new Template1ArtPieceOrderPage(driver);
		String actual = t1apop.getCompletionMsg();
		String expected = "I can't wait to get started, {{ Elad }}!";
		Assert.assertEquals(actual, expected);

	}

}