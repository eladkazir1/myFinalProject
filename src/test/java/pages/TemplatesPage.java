package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplatesPage extends AppPage {

	public TemplatesPage(WebDriver driver) {
		super(driver);

	}
	//-------------------------Elements-----------------------------------------------------------------
	
	@FindBy(css = ".text-sm.font-semibold")
	private WebElement templatesNumLabel;
	@FindBy(css = ".overflow-hidden.relative")
	private List<WebElement> templatesBlocks;
	@FindBy(css=".font-semibold>span:nth-child(1)")
	private WebElement titleLabel;
	@FindBy(css="[data-intercom-target='template-filter-input']")
	private WebElement searchField;
	@FindBy(css=".block.px-3")
	private WebElement searchBtn;
	@FindBy(css="div:nth-child(2) > div > div.px-3")
	private WebElement templateName;
	
	
	//-------------------------Methods------------------------------------------------------------------
	

	// Main Categoty
	public void open_closeMainCategory(String name) {
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector(".px-5"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector(".flex>.py-1"));
			if (titleEl.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}

		}

	}
	// Sub Category
	public void chooseSubCategory(String name) {
		waiting(2000);
		List<WebElement> areaList = driver.findElements(By.cssSelector(".pl-8"));
		for (WebElement el : areaList) {
			WebElement titleEl = el.findElement(By.cssSelector(".divide-y.divide-gray-100 .text-gray-700"));
			if (titleEl.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}

		}

	}
	// Choose Template
		public void chooseTemplate(String templateName) {
			waiting(2000);
			List<WebElement> areaList = driver.findElements(By.cssSelector(".overflow-hidden.relative"));
			for (WebElement el : areaList) {
				WebElement titleEl = el.findElement(By.cssSelector(".px-3.my-3"));
				if (titleEl.getText().equalsIgnoreCase(templateName)) {
					WebElement preview = el.findElement(By.cssSelector(".block.text-gray-600"));
					click(preview);
					break;
				}

			}

		}
		
	//-------------------------Validation---------------------------------------------------------------
		
		public int getTemplatesNumber() {
			String s = getText(templatesNumLabel);
			int i = Integer.parseInt(s);
			return i;
		}
		
		public int getBlocksNumber() {
			waiting(2000);
			List<WebElement> elements = driver.findElements(By.cssSelector(".overflow-hidden.relative"));
			int blocksCount = elements.size();
			return blocksCount;
					
		}
		
		public boolean isTemplatesPage() {
			if (getText(titleLabel).equalsIgnoreCase("Categories")) {
				return true;	
			}
			return false;
		}
		
		public void SearchTemplateByName(String text) {
			waiting(2000);
			fillText(searchField, text);
	
		}
		
		public String SearchField() {
			waiting(2000);
			return getText(searchField);
		}
		
		public String getTemplatesName() {
			waiting(2000);
			return getText(templateName);
			}
		
		
		
}
