package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Template3EyewearQuizPage extends AppPage {

	public Template3EyewearQuizPage(WebDriver driver) {
		super(driver);

	}
	// -------------------------Elements-----------------------------------------------------------------


	// -------------------------Methods------------------------------------------------------------------
	
	public void chooseGenderStyle(String name) {	
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
	
	public void chooseFaceWidth(String name) {	
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
	
	public void chooseShape(String name) {	
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
	
	public void chooseColor(String name) {	
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
	
	public void chooseMaterials(String name) {	
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
	
	
}
