package tests;

import org.testng.annotations.Test;
import pages.MyWorkspacePage;
import pages.Template3EyewearQuizPage;
import pages.TemplatesPage;

public class Template3Test extends AppTest {

	@Test
	public void tc01_template3() {
		// MyWorkspacePage
		MyWorkspacePage mwp = new MyWorkspacePage(driver);
		mwp.closeFeedback();
		mwp.templates();
		// TemplatesPage
		TemplatesPage tp = new TemplatesPage(driver);
		tp.chooseSubCategory("recommend products");
		tp.chooseTemplate("shoppable eyewear quiz");
		// EyewearQuizTemplate
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