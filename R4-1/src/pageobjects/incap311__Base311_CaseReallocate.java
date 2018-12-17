package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311__ Base 311_ Case Reallocate"                                
               , summary=""
               , page="Base311_CaseReallocate"
               , namespacePrefix="Incap311"
               , object="Case"
               , connection="QA"
     )             
public class incap311__Base311_CaseReallocate {

	@ChoiceListType(values = { @ChoiceListValue(value = "Test Queue"), @ChoiceListValue(value = "TEST"),
			@ChoiceListValue(value = "PWD Pick Up Dead Animals"),
			@ChoiceListValue(value = "PWD Missd Trash-Recycle-Yard Waste-Bulk"),
			@ChoiceListValue(value = "PWD District 03: North Dorchester"),
			@ChoiceListValue(value = "PWD District 02: Jamaica Plain") })
	@FindBy(xpath = "//tr/td[1]/select")
	public WebElement SelectCaseOwner;
	@TextType()
	@FindByLabel(label = "* Reason")
	public WebElement reason;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{! save }']")
	public WebElement save;
	
}
