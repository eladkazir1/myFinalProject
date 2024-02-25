package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Template1ArtPieceOrderPage extends AppPage {

	public Template1ArtPieceOrderPage(WebDriver driver) {
		super(driver);
	}
	// -------------------------Elements-----------------------------------------------------------------

	@FindBy(css = ".e-freetxt-answer")
	private WebElement textField;

	@FindBy(css = "[placeholder='First Name']")
	private WebElement firstNameField;

	@FindBy(css = "[placeholder='Last Name']")
	private WebElement lastNameField;

	@FindBy(css = "[placeholder='Email*']")
	private WebElement emailAdressField;

	@FindBy(css = "[placeholder='Street address*']")
	private WebElement streetAddressField;

	@FindBy(css = "[placeholder='Postal code*']")
	private WebElement postalCodeField;

	@FindBy(css = "[placeholder='City*']")
	private WebElement cityField;

	@FindBy(css = "[placeholder='Country*']")
	private WebElement countryDD;

	@FindBy(css = "[id^='vs1__option']")
	private WebElement countryName;

	@FindBy(css = ".c-headline-container.content-item h1>span")
	private WebElement completionMsg;

	// -------------------------Methods------------------------------------------------------------------

	public void choosePaintingStyle(String name) {
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector(".answer-behaviour"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector("[class='c-image-answer-title']"));
			if (titleEl.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}

		}

	}

	public void choosePaintingObject(String name) {
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector(".answer-behaviour.square"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector("[class='c-image-answer-title']"));
			if (titleEl.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}

		}

	}

	public void PaintingDescribe(String text) {
		waiting(2000);
		fillText(textField, text);
	}

	public void choosePaintingFormat(String name) {
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector(".answer-behaviour"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector("[class='c-image-answer-title']"));
			if (titleEl.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}

		}

	}

	public void shippingAddress(String firstName, String lastName, String email, String streetAddress,
			String postalCode, String city) {
		waiting(2000);
		fillText(firstNameField, firstName);
		fillText(lastNameField, lastName);
		fillText(emailAdressField, email);
		fillText(streetAddressField, streetAddress);
		fillText(postalCodeField, postalCode);
		fillText(cityField, city);
//		click(agreementChk);
	}

	public void chooseCountry(String name) {
		waiting(2000);
		click(countryDD);
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector("#vs1__listbox"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector("[id^='vs1__option']"));
			if (titleEl.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}

		}

	}

	public void fillCountry(String text) {
		fillText(countryDD, text);
		click(countryName);
	}

//-------------------------Validation---------------------------------------------------------------

	public String getCompletionMsg() {
		waiting(2000);
		return getText(completionMsg);
	}

}
