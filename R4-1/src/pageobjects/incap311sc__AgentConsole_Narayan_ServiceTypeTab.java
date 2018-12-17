package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Narayan_ Service Type Tab"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Narayan_ServiceTypeTab {

	WebDriver driver = null;
    // constructor driver initialization
	public incap311sc__AgentConsole_Narayan_ServiceTypeTab(WebDriver driver) {
		this.driver = driver;
	}

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-col\")]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]")
	public WebElement Button_SelectSRType;
	@PageWaitAfter.Field(timeoutSeconds = 10)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(id = "searchServiceTypesFilter")
	public WebElement TextBox_searchServiceType;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"service-type-details\")]/div[1]/div/div[2]")
	public WebElement SRDescriptionWithSLA;
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"knowledge-article\")]")
	public WebElement KnowledgeSectionDetailCard;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(id = "knowledgeSearchFilter")
	public WebElement KnowledgeSectionSearchBar;
	
	public void selectSRType(String SRTName){
	driver.findElement(By.xpath("//*[contains(text(),'" + SRTName + "')]")).click();
	}
	
}
