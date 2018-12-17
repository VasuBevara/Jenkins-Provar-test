package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="incap311sc__AgentConsole_Aadil_ServiceTypeTab_Location" //Incap 311sc__ Agent Console_ Aadil_ Service Type Tab_ Contact Info                               
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Aadil_ServiceTypeTab_Location {
	@ButtonType()
	@FindByLabel(label = "Mark duplicate")
	public WebElement markDuplicate;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div[2]/div[2]/div/div[2]/div[2]/div/form/div/div/div/div/div[2]/*[name()=\"svg\"]")
	public WebElement ShowAccountContactsToAddAContacts;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/div/div[2]")
	public WebElement ContactInfomationLabel;
	@TextType()
	@FindBy(xpath = "//input[@name=\"name\"]")
	public WebElement accountEnterName;
	@TextType()
	@FindBy(xpath = "//input[@name=\"billingStreet\"]")
	public WebElement accountBillingStreet;
	@TextType()
	@FindBy(xpath = "//input[@name=\"billingPostalCode\"]")
	public WebElement AccountBillingPostalCode;
	@TextType()
	@FindBy(xpath = "//div[4]/div[@class=\"slds-form-element\"]/div[@class=\"slds-form-element__control\"]/input")
	public WebElement AccountPhone;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div[1]/div[2]/div/div[2]/div[2]/div/form/div/div/div/div/div[2]/*[name()=\"svg\"]/*[name()=\"use\"]")
	public WebElement ShowContactsToAddANewContacts;
	@TextType()
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@name=\"lastName\"]")
	public WebElement LastName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element\")]/div/div/input")
	public WebElement Phone;
	@TextType()
	@FindBy(xpath = "//input[@name=\"email\"]")
	public WebElement Email;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/div/div[2]")
	public WebElement AccountDetailsInformation1;
	@TextType()
	@FindBy(css = "span.esri-collapse__icon.esri-expand__icon--expanded.esri-icon-collapse")
	public WebElement LocationPopUpIconBack;
	@TextType()
	@FindBy(xpath = "//input[@name=\"locationFilter\"]")
	public WebElement searchForALocation;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"slds-box\")][1]")
	public WebElement bostonSt;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-modal__header\")]//h2")
	public WebElement DuplicatePopUpBoxShown;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"slds-modal__footer\")]//button[2]")
	public WebElement continueWithoutDuplicate;
	
	//-------------------------------------------------------
	
	
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancelOnPopupWindow;
	@ButtonType()
	@FindByLabel(label = "Close")
	public WebElement close;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-modal__container\")]/div[2]")
	public WebElement DuplicateDetectedInsideText;
	@ButtonType()
	@FindByLabel(label = "Close")
	public WebElement close1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-col\")]/div/div/div[2]/div/h1[contains(text(),'Creation')]/parent::div")
	public WebElement ServiceRequestCreationTextPresent;
	
	
}
