package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Aadil_ Service Type Tab_ Contact Info"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Aadil_ServiceTypeTab_ContactInfo {

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
	@FindBy(xpath = "//input[@name=\"phone\"]")
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
	@FindBy(xpath = "//div/div[2]/div[2]/div/div[2]/div[1]//input")
	public WebElement SearchAccountExists;
	@LinkType()
	@FindBy(xpath = "//div[@class=\"slds-form-element react-slds-dropdown-form-element\"]//ul/li[@role=\"presentation\"]/a[contains(@class, \"slds-lookup__item-action\")]")
	public WebElement SelectContact;
	@LinkType()
	@FindBy(xpath = "//div/div[2]/div[2]/div/div[2]//a")
	public WebElement SelectedAccountContact;
	@ButtonType()
	@FindByLabel(label = "Remove")
	public WebElement remove;	
	@TextType()
	@FindBy(xpath = "//div[@class='slds-grid slds-grid--vertical sidebar-section slds-m-bottom--medium']//span[contains(text(),'Accounts')]//parent::div/parent::div/parent::div//a/button")
	public WebElement RemoveAccount;
	@TextType()
	@FindBy(xpath = "//div/div[1]/div[2]/div/div[2]/div[1]//input")
	public WebElement SearchContact;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"item-main\")]")
	public WebElement SearchContactResults;
	@TextType()
	@FindByLabel(label = "Name", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement AccountName;
	@TextType()
	@FindByLabel(label = "Name", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement accountBillingStreet_1;
	@TextType()
	@FindByLabel(label = "Name", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement accountBillingStreet_11;
	@TextType()
	@FindBy(xpath = "//*[@id=\"BillingStreet\"]/div/div/div/div/input")
	public WebElement accountBillingStreet_2;
	@TextType()
	@FindBy(xpath = "//*[@id=\"BillingPostalCode\"]/div/div/div/div/input")
	public WebElement AccountBillingPostalCode_1;
	@TextType()
	@FindByLabel(label = "RequiredFirst Name", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement contactFirstName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/div/div[2]/div[4]/div/div/div/div/input")
	public WebElement accountPhoneNumber;
	@TextType()
	@FindBy(xpath = "//*[@id=\"FirstName\"]/div/div/div/div/input")
	public WebElement contactFirstName_1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"LastName\"]/div/div/div/div/input")
	public WebElement contactLastName_1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"Email\"]/div/div/div/div/input")
	public WebElement contactEmail;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/div/div/div/div[1]/div[1]/span")
	public WebElement Contact;

}
