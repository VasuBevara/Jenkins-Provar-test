package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311console__ Console311_ Aadil_ SR_ Activity_ Edit"                                
               , page="Console311_Aadil_SR_Activity_Edit"
               , namespacePrefix="Incap311Console"
               , object="Incap311__Service_Activity__c"
               , connection="QA"
     )             
public class incap311console__Console311_Aadil_SR_Activity_Edit {

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/select")
	public WebElement selectAnOutcome;
	@TextType()
	@FindBy(xpath = "//label[contains(@for,'addComments')][contains(text(),'Additional Comments')]/parent::div//textarea")
	public WebElement response;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/div/textarea")
	public WebElement internalComments;
	@TextType()
	@FindBy(id = "serviceQuestions-picklist-0")
	public WebElement theGodfather;
	@TextType()
	@FindBy(xpath = "//*[@id=\"option-list-0\"]/li[1]/span/span")
	public WebElement picklistOPTPanelid;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
