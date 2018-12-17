package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Narayan_ Activity Console"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Narayan_ActivityConsole {

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
	@LinkType()
	@FindBy(xpath = "//li[2]//a")
	public WebElement secondOutcome;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'slds-scrollable--y')]/div[4]/div[2]/div/label/span")
	public WebElement internalCommentLabel;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'slds-scrollable--y')]/div[5]/div[2]/div/label/span")
	public WebElement additionalCommentLabel;
	
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-grid\")]/div[1]/label/p")
	public WebElement provarTestSRImagePicklistOption1Select;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//p[contains(@class, \"error-message\")]")
	public WebElement ErrorPopUpOnActivitiesEdit;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"slds-modal__close\")]")
	public WebElement closeErrorPopup;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancelActivityEdit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-input-has-icon\")]")
	public WebElement FinishDate;
	
}
