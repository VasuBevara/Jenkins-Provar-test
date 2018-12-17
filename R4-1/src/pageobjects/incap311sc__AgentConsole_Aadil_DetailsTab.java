package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

//Class declaration
@SalesforcePage(title = "Incap 311sc__ Agent Console_ Aadil_ Details Tab", page = "AgentConsole", namespacePrefix = "Incap311SC", object = "Case", connection = "QA")
public class incap311sc__AgentConsole_Aadil_DetailsTab {

	// driver declaration
	public WebDriver driver;

	public final String replaceThis = "ReplaceThis";

	// declaration of common xpaths
	public final String textArea = "//span[contains(text(),'" + replaceThis + "')]/../../following::textarea";
	public final String text = "//span[contains(text(),'" + replaceThis + "')]/../../following::input";
	public final String picklist = "//span[contains(text(),'" + replaceThis + "')]/../following::fieldset";

	// constructor driver initialization
	public incap311sc__AgentConsole_Aadil_DetailsTab(WebDriver driver) {
		this.driver = driver;
	}

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/nav/a[4]/span/span[2]/span")
	public WebElement Link_Details;

	@PageRow()
	public static class ConditionPicklist {
		@LinkType()
		@FindBy(xpath = ".//label")
		public WebElement PicklistValue;

	}
public void clickOnPossibleDuplicates(String SrNumber)
	{
		driver.findElement(By.xpath("//div[contains(@class,'duplicates')]//a[contains(text(),'"+SrNumber+"')]/ancestor::div[@class='slds-col']/p[contains(text(),'Boston')]")).click();
	}
	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = "."), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "(//fieldset)[1]//div")
	@PageTable(firstRowContainsHeaders = false, row = ConditionPicklist.class)
	public List<ConditionPicklist> ConditionPicklist;

	private WebElement getWebElement(String controlType, String label, String input){
	WebElement resultElement = null;
	
	String xpath = "";
	switch(controlType.toLowerCase()){	
		case "textarea":
			xpath = this.textArea;
			break;
		case "text":
			xpath = this.text;
			break;
		case "picklist":
			xpath = this.picklist;
			break;
		default:	
	}
	xpath = xpath.replace(replaceThis, label);
	resultElement = driver.findElement(By.xpath(xpath));
	return resultElement;
		
	}

	public void OperateOnElement(String controlType, String label, String input) {
	    WebElement element = null;
		switch (controlType.toLowerCase()){
		case "text":
			element = this.getWebElement(controlType, label, input);
			element.sendKeys(input);
			break;
		case "textarea":
			element = this.getWebElement(controlType, label, input);
			element.sendKeys(input);
			break;
		case "picklist":
			element = this.getWebElement(controlType, label, input);
			operateOnPicklist(element, input);
			break;
		default:
		
		}
	}
	
	private void operateOnPicklist(WebElement element, String input){
		
			WebElement ele = element.findElement(By.xpath("./div/label[contains(text(),'" + input + "')]"));
			if (ele != null){
				ele.click();
				ele = null;
			}
		
	}


	@ButtonType()
	@FindBy(xpath = "//*[@id=\"STQ-00002051\"]/div/div/div/button")
	public WebElement Question1HintBox;

	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00002051\"]/div/div/div/div/div/p")
	public WebElement Question1HintBoxText;

	@ButtonType()
	@FindBy(xpath = "//*[@id=\"STQ-00002052\"]/div/div/div/button")
	public WebElement Question2HintBox;

	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00002052\"]/div/div/div/div/div")
	public WebElement Question2HintBoxText;

	@ButtonType()
	@FindBy(xpath = "//*[@id=\"STQ-00002053\"]/div/div/div[1]/button")
	public WebElement Question3HintBox;

	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00002053\"]/div/div/div[1]/div/div/p")
	public WebElement Question3HintBoxText;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__label\")]/div/button")
	public WebElement Question4HintBox;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__label\")]/div/div/div/p")
	public WebElement Question4HintBoxText;

	@ButtonType()
	@FindBy(xpath = "//*[@id=\"STQ-00002056\"]/div/div/div/button")
	public WebElement Question5HintBox;

	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00002056\"]/div/div/div/div/div/p")
	public WebElement Question5HintBox1;

	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00002056\"]/div/div/div/div/div/p")
	public WebElement Question5HintBoxText;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"date-picker\")]/div[1]/button")
	public WebElement Question6HintBox;

	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00002058\"]/div/div/div[1]/div/div")
	public WebElement Question6HintBoxText;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"checkbox-wrapper\")]/div[2]/button")
	public WebElement Question7HintBox;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"checkbox-wrapper\")]/div[2]/div/div/p")
	public WebElement Question7HintBoxText;

	@ButtonType()
	@FindBy(xpath = "//*[@id=\"STQ-00002060\"]/div/div/div[1]/button")
	public WebElement Question8HintBox;

	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00002060\"]/div/div/div[1]/div/div/p")
	public WebElement Question8HintBoxText;
	@TextType()
	@FindBy(xpath = "//html[@class=\" ext-strict\"]//div[@id=\"app\"]/div[@class=\"app-wrapper\"]/div/div[2]/div/div[2]/div[1]/nav[contains(@class, \"left-nav\")]/a[1]")
	public WebElement ServiceTypeNameOnServiceTypeTab;

	@ButtonType()
	@FindByLabel(label = "Submit")
	public WebElement submit;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"request-info-wrapper\")]/div[2]/div[2]")
	public WebElement RequestDetailsSectionWithAllQuestions;


	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"recommendations-section\")]/div")
	public WebElement RecommendedSRType;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"right-sidebar\")]/div[1]/div[2]")
	public WebElement ServiceDetailsSection;
}
