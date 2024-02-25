package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWorkspacePage extends AppPage {

	public MyWorkspacePage(WebDriver driver) {
		super(driver);
	}
	// -------------------------Elements-----------------------------------------------------------------

	@FindBy(css = "#embed-popup-close")
	private WebElement closeFeedbackBtn;
	@FindBy(css = "#popup-container path:nth-child(2)")
	private WebElement closeBlackFridayPopupBtn;
	@FindBy(css = ".mr-3.text-xl")
	private WebElement titleLabel;

	// -------------------------Methods------------------------------------------------------------------

	public void closeFeedback() {
		waitForElementToBeClickable(closeFeedbackBtn);
		click(closeFeedbackBtn);
	}

	public void closeBlackFridayPopup() {
		waitForElementToBeClickable(closeBlackFridayPopupBtn);
		click(closeBlackFridayPopupBtn);
	}

	// -------------------------Validation---------------------------------------------------------------

	public boolean isProjectsPage() {
		if (getText(titleLabel).equalsIgnoreCase("My Workspace")) {
			return true;
		}
		return false;
	}

}
