package pageobjects;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Narayan_ Pop Ups"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Narayan_PopUps {

	public WebDriver driver;
	
	// constructor driver initialization
	public incap311sc__AgentConsole_Narayan_PopUps(WebDriver driver) {
		this.driver = driver;
	}

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'slds-modal__footer')]//button[1]")
	public WebElement cancelButtonDuplicate;
	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'slds-modal__footer')]//button[2]")
	public WebElement continueWithoutDuplicate;
	
	
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"slds-modal__close\")]")
	public WebElement CloseDuplicatesPopup;
	
	public void selectDuplicateSRFromDuplicatesPopup(String SRCode){
		String xpath = "//a[contains(text(),'" + SRCode + "')]/../../..";
		driver.findElement(By.xpath(xpath)).click();
	}

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"slds-modal__footer\")]//button[3]")
	public WebElement markDuplicate;
	
}
