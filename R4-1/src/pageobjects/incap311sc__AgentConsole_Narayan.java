package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Narayan"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Narayan {

    WebDriver driver = null;
    // constructor driver initialization
	public incap311sc__AgentConsole_Narayan(WebDriver driver) {
		this.driver = driver;
	}

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(linkText = "Submit Request")
	public WebElement Link_submitRequest;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(linkText = "Submit Request")
	public WebElement submitRequest;
	//a[contains(text(), '18-00022941')]
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//td[contains(text(), 'Transfer Parent')]/../td/div/a")
	public WebElement TransferParent;
	@ButtonType()
	@FindByLabel(label = "New Service Request")
	public WebElement ResetAndNewServiceRequest;
	
	
	
}
