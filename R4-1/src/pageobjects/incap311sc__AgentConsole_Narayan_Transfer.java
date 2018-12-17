package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Narayan_ Transfer"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Narayan_Transfer {

	@TextType()
	@FindByLabel(label = "New Service Type*", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement newServiceType;
	@ButtonType()
	public WebElement Priority_Details;
	@LinkType()
	@FindBy(linkText = "Emergency")
	public WebElement Priority_Details_List;
	@ButtonType()
	@FindBy(css = "#form-element-b6c358bf-bab1-4aa1-94f5-f91e18d9760e")
	public WebElement selectAnOption_Origin;
	@LinkType()
	@FindBy(linkText = "API")
	public WebElement Origin_Details_List;
	@TextType()
	@FindByLabel(label = "Phone flex question for testing", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement phoneFlexQuestionForTesting;
	@TextType()
	@FindBy(id = "homeSearchFilter")
	public WebElement exploreCityServices;
	
}
