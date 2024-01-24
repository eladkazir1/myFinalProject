package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Template2CustomerSurveyPage extends AppPage {

	public Template2CustomerSurveyPage(WebDriver driver) {
		super(driver);

	}
	// -------------------------Elements-----------------------------------------------------------------
	
	@FindBy(css=".e-freetxt-answer")
	private WebElement textField;
	
	@FindBy(css="[placeholder='Select*']")
	private WebElement durationTimeDD;
	
	@FindBy(css=".c-headline-container.content-item h1>span")
	private WebElement completionMsg;

	// -------------------------Methods------------------------------------------------------------------

	public void rateRecommendCompany(int rate) {
		waiting(2000);
		int slider_rail_width = driver.findElement(By.cssSelector("[class='slider-item']")).getSize().width; // אלמנט של אורך הסליידר
		actions.clickAndHold(driver.findElement(By.cssSelector("[type='range']"))).pause(Duration.ofMillis(400)).build().perform();// העיגול שתופסים ומזיזים את הסליידר	
		actions.moveByOffset(slider_rail_width / 10 * rate - 6, 0).build().perform();
		actions.release().build().perform();
	}

	public void rateProducts(String name) {
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector(".answer-behaviour"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector("[style='text-align: left; flex-grow: 1;']"));
			if (titleEl.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}

	public void rateNeeds(String name) {
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector(".answer-behaviour"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector("[style='text-align: left; flex-grow: 1;']"));
			if (titleEl.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}

	public void rateProductQuality(int number) {
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector("[class='rating-item']"));
		areaList.get(number).click();

	}
	
	public void rateProductValue(int number) {
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector("[class='rating-item']"));
		areaList.get(number).click();

	}
	
	public void rateResponsive(int rate) {
		waiting(2000);
		int slider_rail_width = driver.findElement(By.cssSelector("[class='slider-item']")).getSize().width; // אלמנט של אורך הסליידר
		actions.clickAndHold(driver.findElement(By.cssSelector("[type='range']"))).pause(Duration.ofMillis(400)).build().perform();// העיגול שתופסים ומזיזים את הסליידר	
		actions.moveByOffset(slider_rail_width / 10 * rate - 6, 0).build().perform();
		actions.release().build().perform();
	}
	
	public void ratePurchaseProducts(int rate) {
		waiting(2000);
		int slider_rail_width = driver.findElement(By.cssSelector("[class='slider-item']")).getSize().width; // אלמנט של אורך הסליידר
		actions.clickAndHold(driver.findElement(By.cssSelector("[type='range']"))).pause(Duration.ofMillis(400)).build().perform();// העיגול שתופסים ומזיזים את הסליידר	
		actions.moveByOffset(slider_rail_width / 10 * rate - 6, 0).build().perform();
		actions.release().build().perform();
	}
	
	
	public void periodAsCustomer(String name) {	
	waiting(2000);
	click(durationTimeDD);
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
	
	public void writeComments(String text) {
		waiting(2000);
		fillText(textField, text);
	}
	
	//-------------------------Validation---------------------------------------------------------------
	
    public String getCompletionMsg() {
    	waiting(2000);
    	return getText(completionMsg);
    }
	
	

}
