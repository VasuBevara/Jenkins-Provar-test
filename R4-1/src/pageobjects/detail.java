package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Detail"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class detail {

	@ChoiceListType(values = { @ChoiceListValue(value = "High") })
	@FindByLabel(label = "High")
	public WebElement Priority;
	
}
