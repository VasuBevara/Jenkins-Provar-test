package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage(title = "Incap 311sc__ Agent Console_ Aadil_ Activity Console", summary = "", page = "AgentConsole", namespacePrefix = "Incap311SC", object = "Case", connection = "QA")
public class incap311sc__AgentConsole_Aadil_ActivityConsole {

	@TextType()
	@FindBy(xpath = "//*[contains(text(),'Composite Service')]")
	public WebElement whetherLayerListIsOpenOrNot;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"esri-ui-top-right\")]/div[1]/div[2]/div[1]/div/span[1]")
	public WebElement toggleLayerList;

	@ButtonType()
	@FindByLabel(label = "Select an Option")
	public WebElement selectOutcome;

	@LinkType()
	@FindBy(xpath = "//li[1]//a")
	public WebElement firstOutcome;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div[4]/div[2]/div/label/span")
	public WebElement internalCommentLabel;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div[5]/div[2]/div/label/span")
	public WebElement additionalCommentLabel;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-grid\")]/div[1]/label/p")
	public WebElement provarTestSRImagePicklistOption1Select;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@LinkType()
	@FindBy(xpath = "//li[2]//a")
	public WebElement ClickOnSecondOutcome;

	// ----------------------------------------------

	@ButtonType()
	@FindBy(xpath = "//span[contains(text(),'Select a Response')]/parent::label/parent::div//button")
	public WebElement ClickOnResponse;

	@TextType()
	@FindBy(xpath = "//ul[contains(@class, \"slds-dropdown__list\")]/li[2]/a/p")
	public WebElement SelectSecondResponse;

	@TextType()
	@FindBy(xpath = "//input[contains(@class, \"slds-input\")]")
	public WebElement FinishDateFieldOfActivity;

	@TextType()
	@FindBy(xpath = "//div[@class=\"date-picker \"]")
	public WebElement FinishDate;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-grid slds-grid--vertical sidebar-section slds-m-bottom--medium finish-date-section\")]")
	public WebElement FinishDateActivity;

	@ChoiceListType(values = { @ChoiceListValue(value = "1967"), @ChoiceListValue(value = "1968"),
			@ChoiceListValue(value = "1969"), @ChoiceListValue(value = "1970"), @ChoiceListValue(value = "1971"),
			@ChoiceListValue(value = "1972"), @ChoiceListValue(value = "1973"), @ChoiceListValue(value = "1974"),
			@ChoiceListValue(value = "1975"), @ChoiceListValue(value = "1976"), @ChoiceListValue(value = "1977"),
			@ChoiceListValue(value = "1978"), @ChoiceListValue(value = "1979"), @ChoiceListValue(value = "1980"),
			@ChoiceListValue(value = "1981"), @ChoiceListValue(value = "1982"), @ChoiceListValue(value = "1983"),
			@ChoiceListValue(value = "1984"), @ChoiceListValue(value = "1985"), @ChoiceListValue(value = "1986"),
			@ChoiceListValue(value = "1987"), @ChoiceListValue(value = "1988"), @ChoiceListValue(value = "1989"),
			@ChoiceListValue(value = "1990"), @ChoiceListValue(value = "1991"), @ChoiceListValue(value = "1992"),
			@ChoiceListValue(value = "1993"), @ChoiceListValue(value = "1994"), @ChoiceListValue(value = "1995"),
			@ChoiceListValue(value = "1996"), @ChoiceListValue(value = "1997"), @ChoiceListValue(value = "1998"),
			@ChoiceListValue(value = "1999"), @ChoiceListValue(value = "2000"), @ChoiceListValue(value = "2001"),
			@ChoiceListValue(value = "2002"), @ChoiceListValue(value = "2003"), @ChoiceListValue(value = "2004"),
			@ChoiceListValue(value = "2005"), @ChoiceListValue(value = "2006"), @ChoiceListValue(value = "2007"),
			@ChoiceListValue(value = "2008"), @ChoiceListValue(value = "2009"), @ChoiceListValue(value = "2010"),
			@ChoiceListValue(value = "2011"), @ChoiceListValue(value = "2012"), @ChoiceListValue(value = "2013"),
			@ChoiceListValue(value = "2014"), @ChoiceListValue(value = "2015"), @ChoiceListValue(value = "2016"),
			@ChoiceListValue(value = "2017"), @ChoiceListValue(value = "2018"), @ChoiceListValue(value = "2019"),
			@ChoiceListValue(value = "2020"), @ChoiceListValue(value = "2021"), @ChoiceListValue(value = "2022"),
			@ChoiceListValue(value = "2023"), @ChoiceListValue(value = "2024"), @ChoiceListValue(value = "2025"),
			@ChoiceListValue(value = "2026"), @ChoiceListValue(value = "2027") })
	@FindBy(xpath = "//select[contains(@class, \"slds-select\")]")
	public WebElement YearSelectionOnActivityFinishDateCalendar;

	@TextType()
	@FindBy(xpath = "//tr/td/span[contains(text(),'16')]")
	public WebElement SelectDateAsSixteen;

	@TextType()
	@FindBy(xpath = "//div[@class=\"slds-datepicker slds-dropdown slds-dropdown--left\"]/div/div[@class=\"slds-size--1-of-3\"]/select[@class=\"slds-select\"]")
	public WebElement selectYearOfFinishDate;

	@TextType()
	@FindBy(xpath = "//p[contains(@class, \"error-message\")]")
	public WebElement FinishDateErrorMessage;

	@ButtonType()
	@FindBy(xpath = "//div/div/div[1]/div/div/*[@id=\"form-element-b29be422-b901-4c00-955c-f4b6d46a19c0\"]")
	public WebElement mUTKO;

	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Select an Outcome')]/parent::label/parent::div//button/span")
	public WebElement selectedOutcome;

	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Select a Response')]/parent::label/parent::div//button")
	public WebElement ClickOnResponseButton;

	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Internal Comments')]/parent::span")
	public WebElement LabelInternalComment;

	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Additional Comments')]/parent::span")
	public WebElement LabelAdditionalComment;

	@TextType()
	@FindBy(xpath = "//p[contains(@class, \"empty-message\")]")
	public WebElement SelectSREmpty;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-col\")]/div[2]/div[2]/div/div/div[1]")
	public WebElement ServiceTypeSearchedValues;

	@ButtonType()
	@FindBy(xpath = "//span[contains(text(),'Select Queue')]/ancestor::label/parent::div//button")
	public WebElement SelectQueueForReallocation;

	@FindBy(linkText = "PWD Utility Casting Repair")
	@LinkType()
	public WebElement ClickOnSecondOutcomeForReallocation;

	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Reallocation Notes')]/ancestor::label/parent::div//textarea")
	public WebElement ReallocationNotest;

	@TextType()
	@FindBy(xpath = "//fieldset[contains(@class, \"picklist\")]/div[1]/label/span")
	public WebElement SelectYesForQuestion;
}
