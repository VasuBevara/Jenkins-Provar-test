package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Aadil_ Transfer"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Aadil_Transfer {


	@ChoiceListType(values = { @ChoiceListValue(value = "ABNDBIKE", title = "Abandoned Bicycle"),
			@ChoiceListValue(value = "NEEDRMVL", title = "Needle Removal"),
			@ChoiceListValue(value = "PROREGRWH", title = "Provar Regression RWH") })
	@FindByLabel(label = "New Service Type*", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement ClickOnTransferService;
	
	@ChoiceListType(values = { @ChoiceListValue(value = "AIRCRFTDST", title = "Aircraft Noise Disturbance"),
			@ChoiceListValue(value = "PCONCMPLNT", title = "Contractor Complaints") })
	@FindBy(xpath = "//div/div[@class=\"slds-form-element\"]/div[@class=\"slds-form-element__control\"]/select[@class=\"slds-select\"]")
	public WebElement newServiceType;
	
		
		@LinkType()
	@FindBy(linkText = "Transfer Service Type")
	public WebElement transferServiceType;
	
}
