package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Aadil_ Schedule Page"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Aadil_SchedulePage {

	@LinkType()
	@FindBy(xpath = "//nav[contains(@class, \"left-nav\")]//a[6]")
	public WebElement schedule1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'slds-m-bottom--medium')]/div[1]/button")
	public WebElement selectScheduleDate;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"schedule-left-section\")]")
	public WebElement ScheduleTabData;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'slds-m-bottom--medium')]/div[2]/button")
	public WebElement select2ndDateSchedule;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'slds-m-bottom--medium')]/div[3]/button")
	public WebElement select3rdDateSchedule;
	@TextType()
	@FindBy(xpath = "//p[contains(@class, \"slds-p-around--medium\")]")
	public WebElement errorMessageOfSchedule;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-m-around--x-small\")]//h2")
	public WebElement errorMessageOfScheduleForItems;
	
}
