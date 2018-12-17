package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Aadil_ Service Type Tab_ Case Submi"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Aadil_ServiceTypeTab_CaseSubmi {

	@ButtonType()
	@FindByLabel(label = "Submit")
	public WebElement submit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/div/div[2]")
	public WebElement AccountDetailsInformation;
	@ButtonType()
	@FindByLabel(label = "Submit")
	public WebElement submit1;
	@ButtonType()
	@FindByLabel(label = "Continue without duplicate")
	public WebElement continueWithoutDuplicate;
	
}
