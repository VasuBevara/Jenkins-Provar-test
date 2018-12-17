package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Aadil_ Service Type Tab_ Details Tab"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             

public class incap311sc__AgentConsole_Aadil_ServiceTypeTab_DetailsTab {
	// driver declaration

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"request-info-wrapper\")]/div[1]")
	public WebElement RequestInformationText;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"request-info-wrapper\")]/div[2]")
	public WebElement RequestDetailsText;
		@TextType()
	@FindBy(xpath = "//div[contains(@class, \"request-info-wrapper\")]/div[2]/div[2]")
	public WebElement RequestDetailsText1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/div/label/span")
	public WebElement ActivityQuestionResponse;
	@ButtonType()
	@FindBy(xpath = "//span/div[@class=\"slds-p-around--x-small slds-m-bottom--medium survey-question Picklist\"]//div[@class=\"slds-picklist\"]/button[@class=\"slds-picklist__label slds-button slds-button--neutral\"]")
	public WebElement selectAnOptionDropDownList;
	@LinkType()
	@FindBy(linkText = "chimpanzee")
	public WebElement SelectChimpanzee;
	
}
