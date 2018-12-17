package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Aadil_ Service Type Tab"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Aadil_ServiceTypeTab {

	@TextType()
	@FindBy(xpath = "//a[@class=\"knowledge-article slds-box slds-p-around--medium slds-m-bottom--xx-small\"]")
	public WebElement KnowledgeArticle;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"service-field-value\")]")
	public WebElement SLATimePeriod;
	
}
