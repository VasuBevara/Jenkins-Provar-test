package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

//Class declaration
@SalesforcePage(title = "Incap 311sc__ Agent Console_ Narayan_ Details Tab", summary = "", page = "AgentConsole", namespacePrefix = "Incap311SC", object = "Case", connection = "QA")
public class incap311sc__AgentConsole_Narayan_DetailsTab {

	// driver declaration
	public WebDriver driver;

	public final String replaceThis = "ReplaceThis";//.replace("'", "\'");

	// declaration of common xpaths
	public final String textArea = "//span[contains(text()," + replaceThis + ")]/ancestor::div[contains(@class, 'slds-form-element__control')]//textarea";

	public final String additionalDetails = "//span[contains(text()," + replaceThis + ")]/../following::textarea";

	public final String text = "//span[contains(text()," + replaceThis
			+ ")]/ancestor::div[@class = 'slds-form-element__control']//input";

	public final String booleanField = "//span[contains(text()," + replaceThis + ")]";

	public final String dateTime = "//span[contains(text()," + replaceThis + ")]/ancestor::div[contains(@class, 'slds-form-element__control')]//div[@class = 'custom-input slds-grid slds-wrap']";
	
	public final String date = "//span[contains(text()," + replaceThis + ")]/ancestor::div[@class = 'slds-form-element__control']//input";
	
	public final String time = "//span[contains(text()," + replaceThis + ")]/ancestor::div[contains(@class, 'slds-form-element__control')]//input";

	public final String phone = "//span[contains(text()," + replaceThis + ")]/ancestor::div[@class = 'slds-form-element__control']//input";
	
	public final String currency = "//span[contains(text()," + replaceThis + ")]/ancestor::div[@class = 'slds-form-element__control']//input";
	
	public final String picklistMatrix = "//span[contains(text()," + replaceThis + ")]/../following::fieldset";

	public final String number = "//span[contains(text()," + replaceThis + ")]/../../..//div[@class = 'slds-form-element__control']/input";
								
	public final String multiPicklistDropdown = "//span[contains(text()," + replaceThis + ")]/ancestor::div[contains(@class, 'picklist-wrapper ')]//button";
												
	public final String informational = "//span[contains(text()," + replaceThis + ")]";
	
	// constructor driver initialization
	public incap311sc__AgentConsole_Narayan_DetailsTab(WebDriver driver) {
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

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = "."), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "(//fieldset)[1]//div")
	@PageTable(firstRowContainsHeaders = false, row = ConditionPicklist.class)
	public List<ConditionPicklist> ConditionPicklist;

	private WebElement getWebElement(String controlType, String label, String input) {
		WebElement resultElement = null;

		String xpath = "";
		switch (controlType.toLowerCase()) {
		case "textarea":
			xpath = this.textArea;
			break;
		case "text":
			xpath = this.text;
			break;
		case "singlepicklistmatrix":
			xpath = this.picklistMatrix;
			break;
		case "multipicklistmatrix":
			xpath = this.picklistMatrix;
			break;
		case "additionaldetails":
			xpath = this.additionalDetails;
			break;
		case "number":
			xpath = this.number;
			break;
		case "multipicklistdropdown":
			xpath = this.multiPicklistDropdown;
			break;
		case "singlepicklistdropdown":
			//keep this.multiPicklistDropdown here. It is not by error, both share the same xpath
			xpath = this.multiPicklistDropdown;
			break;
		case "boolean":
			xpath = this.booleanField;
			break;
		case "datetime":
			xpath = this.dateTime;
			break;
		case "date":
			xpath = this.date;
			break;
		case "time":
			xpath = this.time;
			break;
		case "phone":
			xpath = this.phone;
			break;
		case "currency":
			xpath = this.currency;
			break;
		case "informational":
			xpath = this.informational;
			break;			
		default:
		
		}
		xpath = xpath.replace(replaceThis, "\"" + label + "\"");
		resultElement = driver.findElement(By.xpath(xpath));
		return resultElement;

	}

	public void OperateOnElement(String controlType, String label, String input) throws Exception {
		WebElement element = null;
		switch (controlType.toLowerCase()) {
		case "text":
			element = this.getWebElement(controlType, label, input);
			element.clear();
			element.sendKeys(input);
			break;
		case "textarea":
			element = this.getWebElement(controlType, label, input);
			element.clear();
			element.sendKeys(input);
			break;
		case "singlepicklistmatrix":
			element = this.getWebElement(controlType, label, input);
			operateOnSinglePicklistMatrix(element, input);
			break;
		case "multipicklistmatrix":
			element = this.getWebElement(controlType, label, input);
			operateOnMultiPicklistMatrix(element, input);
			break;
		case "additionaldetails":
			element = this.getWebElement(controlType, label, input);
			element.clear();
			element.sendKeys(input);
			break;
		case "number":
			element = this.getWebElement(controlType, label, input);
			element.clear();
			element.sendKeys(input);
			break;
		case "multipicklistdropdown":
			element = this.getWebElement(controlType, label, input);
			operateOnMultiPicklistDropdown(element, input);
			break;
		case "singlepicklistdropdown":
			element = this.getWebElement(controlType, label, input);
			operateOnSinglePicklistDropdown(element, input);
			break;
		case "boolean":
			element = this.getWebElement(controlType, label, input);
			operateOnBoolean(element, input);
			break;
		case "datetime":
			element = this.getWebElement(controlType, label, input);
			operateOnDateTime(element, input);
			break;
		case "date":
			element = this.getWebElement(controlType, label, input);
			element.clear();
			element.sendKeys(input);
			break;
		case "time":
			element = this.getWebElement(controlType, label, input);
			operateOnTime(element, input);
			break;
		case "phone":
			element = this.getWebElement(controlType, label, input);
			element.clear();
			element.sendKeys(input);
			element.sendKeys(Keys.TAB);
			break;
		case "currency":
			element = this.getWebElement(controlType, label, input);
			element.clear();
			element.sendKeys(input);
			break;
		case "informational":
			element = this.getWebElement(controlType, label, input);
			boolean isInfoDisplayed = false;
			isInfoDisplayed = element.isDisplayed();
			if (isInfoDisplayed == false){
				throw new Exception("Information box is not displayed");
			}
			break;
			//informational
		default:

		}
	}
	
	private void operateOnTime(WebElement element, String input) throws InterruptedException {	
		element.click();
		Thread.sleep(2000);
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys(Keys.chord(input));
	}

	private void operateOnDateTime(WebElement element, String input) {
		String[] inputs = input.split(",");
		String dateInput = inputs[0].trim();
		String timeInput = inputs[1].trim();
		WebElement dateElement = element.findElement(By.xpath("./div/div/div/div/div/div/input"));
		WebElement timeElement = element.findElement(By.xpath("./div[@class = 'slds-p-left--small slds-col']"));
		
		if (!dateInput.equals("")){
			dateElement.sendKeys(dateInput);
		}
		
		if (!timeInput.equals("")){
			timeElement.click();
			List <WebElement> givenTimes = timeElement.findElements(By.xpath("./div/div[@class = 'react-slds-dropdown-control-wrapper']/div/div/ul/li"));
			
			switch(timeInput.toLowerCase().trim()){
				case "12:00 am":
				givenTimes.get(0).click();
				break;
				case "12:30 am":
				givenTimes.get(1).click();
				break;
				case "1:00 am":
				givenTimes.get(2).click();
				break;
				case "1:30 am":
				givenTimes.get(3).click();
				break;
				case "2:00 am":
				givenTimes.get(4).click();
				break;
				case "2:30 am":
				givenTimes.get(5).click();
				break;
				case "3:00 am":
				givenTimes.get(6).click();
				break;
				case "3:30 am":
				givenTimes.get(7).click();
				break;
				case "4:00 am":
				givenTimes.get(8).click();
				break;
				case "4:30 am":
				givenTimes.get(9).click();
				break;
				case "5:00 am":
				givenTimes.get(10).click();
				break;
				case "5:30 am":
				givenTimes.get(11).click();
				break;
				case "6:00 am":
				givenTimes.get(12).click();
				break;
				case "6:30 am":
				givenTimes.get(13).click();
				break;
				case "7:00 am":
				givenTimes.get(14).click();
				break;
				case "7:30 am":
				givenTimes.get(15).click();
				break;
				case "8:00 am":
				givenTimes.get(16).click();
				break;
				case "8:30 am":
				givenTimes.get(17).click();
				break;
				case "9:00 am":
				givenTimes.get(18).click();
				break;
				case "9:30 am":
				givenTimes.get(19).click();
				break;
				case "10:00 am":
				givenTimes.get(20).click();
				break;
				case "10:30 am":
				givenTimes.get(21).click();
				break;
				case "11:00 am":
				givenTimes.get(22).click();
				break;
				case "11:30 am":
				givenTimes.get(23).click();
				break;
				case "12:00 pm":
				givenTimes.get(24).click();
				break;
				case "12:30 pm":
				givenTimes.get(25).click();
				break;
				case "1:00 pm":
				givenTimes.get(26).click();
				break;
				case "1:30 pm":
				givenTimes.get(27).click();
				break;
				case "2:00 pm":
				givenTimes.get(28).click();
				break;
				case "2:30 pm":
				givenTimes.get(29).click();
				break;
				case "3:00 pm":
				givenTimes.get(30).click();
				break;
				case "3:30 pm":
				givenTimes.get(31).click();
				break;
				case "4:00 pm":
				givenTimes.get(32).click();
				break;
				case "4:30 pm":
				givenTimes.get(33).click();
				break;
				case "5:00 pm":
				givenTimes.get(34).click();
				break;
				case "5:30 pm":
				givenTimes.get(35).click();
				break;
				case "6:00 pm":
				givenTimes.get(36).click();
				break;
				case "6:30 pm":
				givenTimes.get(37).click();
				break;
				case "7:00 pm":
				givenTimes.get(38).click();
				break;
				case "7:30 pm":
				givenTimes.get(39).click();
				break;
				case "8:00 pm":
				givenTimes.get(40).click();
				break;
				case "8:30 pm":
				givenTimes.get(41).click();
				break;
				case "9:00 pm":
				givenTimes.get(42).click();
				break;
				case "9:30 pm":
				givenTimes.get(43).click();
				break;
				case "10:00 pm":
				givenTimes.get(44).click();
				break;
				case "10:30 pm":
				givenTimes.get(45).click();
				break;
				case "11:00 pm":
				givenTimes.get(46).click();
				break;
				case "11:30 pm":
				givenTimes.get(47).click();
				break;
				
				default:
			}
			
		}
		

	}

	private void operateOnSinglePicklistMatrix(WebElement element, String input) {
	
	if (input.toLowerCase().trim().equals("unselect")){
			WebElement selectedItem = element.findElement(By.xpath(
				"./div/label[@class = 'picklist-item slds-p-around--x-small selected']"));
			selectedItem.click();		
		}else{
			WebElement ele = element.findElement(By.xpath("./div/label[contains(text(),'" + input.trim() + "')]"));
			if (ele != null) {
				ele.click();
				ele = null;
			}
		}

	}
	
	public String handleAlart(String locatorStr){
		WebElement elmt;
		int i = driver.findElements(By.xpath(locatorStr)).size();
		if(i>0) {
			String str = driver.findElement(By.xpath(locatorStr+"/../following-sibling::div/p")).getText();
			elmt = driver.findElement(By.xpath(locatorStr));
			elmt.click();
			
			return str;
			//return elmt.findElement(By.xpath("/../following-sibling::div/p")).getText();
		}else{
			return "";
		}
	}
	
	private void operateOnMultiPicklistMatrix(WebElement element, String input) {
	
	String itemsTOBeSelected[] = input.split(",");
		
	if (input.toLowerCase().trim().equals("unselect")){
			List <WebElement> selectedItems = element.findElements(By.xpath(
				"./div/label[@class = 'picklist-item slds-p-around--x-small selected']"));
			for (WebElement selectedItem : selectedItems){
				selectedItem.click();		
			}
		}else{
		//unselect all existing selected once
			List <WebElement> selectedItems = element.findElements(By.xpath(
				"./div/label[@class = 'picklist-item slds-p-around--x-small selected']"));
			for (WebElement selectedItem : selectedItems){
				selectedItem.click();
			}
			
			//select what is newly asked to be selected
			for(int i = 0; i < itemsTOBeSelected.length; i++){
				WebElement ele = element.findElement(By.xpath("./div/label[contains(text(),'" + itemsTOBeSelected[i].trim() + "')]"));
				if (ele != null) {
					ele.click();
					ele = null;
				}
			}
		}

	}
	
	private void operateOnMultiPicklistDropdown(WebElement element, String input) {
		// click dropdown
		element.click();

		// Uncheck all selected
		List<WebElement> selectedItems = element.findElements(By.xpath(
				"./../../../following-sibling::div/div/div/ul/li[@class = 'slds-dropdown__item slds-is-selected']"));
		for (WebElement item : selectedItems) {
			item.click();
		}
		
		//select what is required to be
		List<WebElement> nonSelectedItems = element.findElements(
				By.xpath("./../../../following-sibling::div/div/div/ul/li[@class = 'slds-dropdown__item']"));
		String itemsTobeSelected[] = input.split(",");

		for (WebElement item : nonSelectedItems) {

			for (int i = 0; i < itemsTobeSelected.length; i++) {
				if (item.findElement(By.xpath("./a")).getAttribute("value").toLowerCase()
						.equals(itemsTobeSelected[i].toLowerCase())) {
					item.click();
					nonSelectedItems = element.findElements(By
							.xpath("./../../../following-sibling::div/div/div/ul/li[@class = 'slds-dropdown__item']"));
					
				}
			}

		}
		// hiding the multipicklist dropdown
		element.click();
		
	}
	
	private void operateOnSinglePicklistDropdown(WebElement element, String input) throws InterruptedException {
		// click dropdown
		element.click();
		
		if (input.toLowerCase().equals("unselect")){
			WebElement selectedItem = element.findElement(By.xpath(
				"./../../../following-sibling::div/div/div/ul/li[@class = 'slds-dropdown__item slds-is-selected']"));
			selectedItem.click();		
		}else{
		element.findElement(By.xpath("./../../../following-sibling::div/div/div/ul/li[@class = 'slds-dropdown__item']/a[@value = '" + input + "']")).click();
		}

	}

	private void operateOnBoolean(WebElement element, String input) {

		String currentState = element.findElement(By.xpath("./../input")).getAttribute("value");
		if (currentState.toLowerCase().equals("false")) {
			if (input.toLowerCase().equals("true")) {
				element.click();
			}
		}

		if (currentState.toLowerCase().equals("true")) {
			if (input.toLowerCase().equals("false")) {
				element.click();
			}
		}

	}

	

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
