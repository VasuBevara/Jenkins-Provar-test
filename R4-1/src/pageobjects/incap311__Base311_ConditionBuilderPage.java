package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311__ Base 311_ Condition Builder Page"                                
               , summary=""
               , page="Base311_ConditionBuilderPage"
               , namespacePrefix="Incap311"
               , object=""
               , connection="QA"
     )             
public class incap311__Base311_ConditionBuilderPage {

	@ButtonType()
	@FindByLabel(label = "Add Condition")
	public WebElement addCondition;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"group-actions\")]//button[1]")
	public WebElement addCondition1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"form-element-1f52dc02-c98a-40b5-b321-f39cf6eeb607\"]")
	public WebElement ClickOnQuestionToChange;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@FindByLabel(label = "Value", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement value;
	
}
