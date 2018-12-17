package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SRDetailsPage"                                
     , summary=""
     , relativeUrl=""
     , connection="Internal311Qa"
     )             
public class SRDetailsPage {

	@TextType()
	@FindBy(xpath = "//h2[contains(@class, \"pageDescription\")]")
	public WebElement srNumber;
	@BooleanType()
	@FindByLabel(label = "Remember me")
	public WebElement rememberMe;
	@TextType()
	@FindByLabel(label = "Password")
	public WebElement password;
	@ButtonType()
	@FindByLabel(label = "Log In")
	public WebElement logIn;
	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(id = "phSearchInput")	
	public WebElement searchSalesforce;
	@TextType()
	@FindBy(xpath = "//input[@name=\"str\"]")
	public WebElement searchSalesforce1;
	@TextType()
	@FindBy(xpath = "//input[@name=\"str\"]")
	public WebElement searchSalesforce2;
	@ButtonType()
	@FindByLabel(label = "Close Service Request")
	public WebElement CloseSRButton;
	@ButtonType()
	@FindBy(css = "#bottomButtonRow input[type='button'][name='close']")
	public WebElement Close;
	@ButtonType()
	@FindByLabel(label = "Back to Case")
	public WebElement backToCase;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"5004100000Fjfbh_RelatedEntityHistoryList_body\"]/table/tbody/tr[2]/td[2]")
	public WebElement CaseTransferDetailsFromToSRTV;
	@LinkType()
	@FindBy(linkText = "17-00011106")
	public WebElement ClosedAndTransferredCaseNumber;
	@LinkType()
	@FindBy(linkText = "Service Request Creation")
	public WebElement serviceRequestCreation;
	@TextType()
	@FindBy(xpath = "html/body/div[4]/div/div[1]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement ConsoleMenu1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen32\"]")
	public WebElement ConsoleMenu11;
	@LinkType()
	@FindBy(linkText = "BH TEST TEST BH")
	public WebElement bHTESTTESTBH;
	@ChoiceListType(values = { @ChoiceListValue(value = "New"), @ChoiceListValue(value = "Working"),
			@ChoiceListValue(value = "Escalated"), @ChoiceListValue(value = "Closed"), @ChoiceListValue(value = "Hold"),
			@ChoiceListValue(value = "Open") })
	@FindBy(id = "cas7_ileinner")
	public WebElement Status;
	@TextType()
	@FindBy(xpath = "//h1[contains(@class, \"pageType\")]")
	public WebElement KnowledgeArticleTitle;
	@TextType()
	@FindBy(xpath = "//*[@id=\"ext-gen74\"]")
	public WebElement SubTabMenuList;
	@TextType()
	@FindBy(id = "ext-gen36")
	public WebElement SubTabMenuList1;
	@TextType()
	@FindBy(id = "ext-gen233")
	public WebElement SubTabMenuList2;
	@TextType()
	@FindBy(xpath = "//div[@class=\"x-plain-header sd_secondary_tabstrip x-unselectable\"]/*[@id=\"ext-gen233\"]")
	public WebElement SubTabMenuItem5;
	@TextType()
	@FindBy(id = "ext-gen74")
	public WebElement SubTabMenuList6;
	@ButtonType()
	@FindByLabel(label = "Yes")
	public WebElement yes;
			
	@TextType()
	@FindBy(xpath = "//div[@class=\"menuButton menuButtonRounded appSwitcher\"]/div[@class=\"menuButtonButton\"]/span[@class=\"menuButtonLabel\"][@id=\"tsidLabel\"]")
	public WebElement goToDiffPage;
	@LinkType()
	@FindBy(linkText = "311 Console")
	public WebElement _311Console;
	@TextType()
	@FindBy(xpath = "//div[@id=\"servicedesk\"]/div[@id=\"navigatortab\"]/div[@class=\"x-plain-header sd_primary_tabstrip x-unselectable darkBackground equalHeader\"]/*[@id=\"ext-gen36\"]")
	public WebElement CloseAllTabs;
	@LinkType()
	@FindBy(linkText = "Close all primary tabs")
	public WebElement closeAllPrimaryTabs;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"STQ-00004945\"]/div/div/div/button")
	public WebElement Question_Hint_Box_1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00004945\"]/div/div/div/div/div/p")
	public WebElement Question_Hint_UI_1;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"STQ-00004946\"]/div/div/div/button")
	public WebElement Question_Hint_Box_2;
	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00004946\"]/div/div/div/div/div/p")
	public WebElement Question_Hint_UI_2;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"STQ-00004947\"]/div/div/div[1]/button")
	public WebElement Question_Hint_Box_3;
	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00004947\"]/div/div/div[1]/div/div/p")
	public WebElement Question_Hint_UI_3;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__label\")]/div/button")
	public WebElement Question_Hint_Box_4;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__label\")]/div/div/div/p")
	public WebElement Question_Hint_UI_4;
}
