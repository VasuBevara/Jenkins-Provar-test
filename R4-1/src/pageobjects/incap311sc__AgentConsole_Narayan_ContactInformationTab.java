package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Narayan_ Contact Information Tab"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Narayan_ContactInformationTab {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//nav[contains(@class, \"left-nav\")]/a[3]/span")
	public WebElement ContactInformationTabLink;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//div/div[1]/div[2]/div/div[2]/div[1]//input")
	public WebElement SearchContactBox;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//li[1]//a")
	public WebElement SelectedContact;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div[1]/div[2]/div/div[2]/div[2]/div/form/div/div/div/div/div[2]/*[name()=\"svg\"]")
	public WebElement ExpandNewEditContact;
	@TextType()
	@FindBy(name = "firstName")
	public WebElement firstName;
	@TextType()
	@FindBy(name = "lastName")
	public WebElement lasttName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element\")]/div/div/input")
	public WebElement phone;
	@TextType()
	@FindBy(name = "email")
	public WebElement email;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div/div/div/a/button")
	public WebElement removeSelectedContact;	
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"slds-pill\")]")
	public WebElement SelectedContacts;
	
}
