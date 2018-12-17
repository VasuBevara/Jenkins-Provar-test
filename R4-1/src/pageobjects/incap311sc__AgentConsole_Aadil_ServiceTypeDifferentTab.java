package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Aadil_ Service Type Different Tab"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Aadil_ServiceTypeDifferentTab {

	@TextType()
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]")
	public WebElement DifferentTabsInfo;
	@TextType()
	@FindBy(xpath = "//div[@id=\"app\"]/div[@class=\"app-wrapper\"]/div[@class=\"slds-grid slds-grid--frame slds-grid--vertical content-wrapper\"]/div[2]/div[@class=\"slds-col slds-grid slds-grid--vertical\"]/div[@class=\"slds-col slds-border--top slds-grid\"]/div[@class=\"slds-scrollable--y slds-p-bottom--small slds-col slds-no-flex\"]")
	public WebElement DifferentTabsInfo1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"origin\"]/div/div")
	public WebElement SocialOriginLabelText;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-modal slds-fade-in-open\")]//h2")
	public WebElement DuplicatePopupMessage;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"esri-ui-top-right\")]/div[1]/div[2]/div[1]/div")
	public WebElement HideLocationBoxPopup;
	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'slds-modal__footer')]//button[2]")
	public WebElement continueWithoutDuplicate;
	
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"esri-ui-top-right\")]/div[1]/div[2]/div[1]/div/span[1]")
	public WebElement PutLocationPopupBack;	
	
		public WebElement searchForALocation;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div/a[1]")
	public WebElement SelectedLocationFromSearch;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-m-bottom--medium\")]/div/div/div[2]/div/h1")
	public WebElement SelectedLocationName;
	
}
