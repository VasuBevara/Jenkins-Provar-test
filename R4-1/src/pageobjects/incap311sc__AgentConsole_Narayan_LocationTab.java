package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console_ Narayan_ Location Tab"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole_Narayan_LocationTab {

	public WebDriver driver;
	
	// constructor driver initialization
	public incap311sc__AgentConsole_Narayan_LocationTab(WebDriver driver) {
		this.driver = driver;
	}

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/nav/a[2]/span")
	@LinkType()
	public WebElement LocationTabLink;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(id = "locationFilter")
	public WebElement searchForALocation;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div/a[1]")
	public WebElement SelectedLocationFromSearch;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-m-bottom--medium\")]/div/div/div[2]/div/h1")
	public WebElement SelectedLocationName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"esri-popup__actions\")]/div[2]/span[1]")
	public WebElement RemoveLocation;
	
	public void selectCurrentLocationPin(){
		String xpath = "//div[@class = 'esri-display-object']/../div[2]/*[name() = 'svg']/*[name() = 'g']";
		WebElement ele = driver.findElement(By.xpath(xpath));
		
		Actions actionBuilder = new Actions(driver);
		actionBuilder.click(ele).build().perform();
		
	}

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"esri-ui-top-right\")]/div[1]/div[2]/div[1]/div/span[1]")
	public WebElement AdditionalLayerListToggle;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"esri-ui-top-right\")]/div[1]/div[2]/div[2]/div/div")
	public WebElement AdditionalLayerList;
	
	
		//-------------------------------------------------------
	
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"esri-ui-top-left\")]/div[2]/div[2]/div[1]/div/span[1]")
	public WebElement GeoLayersToggleButton;
	@TextType()
	@FindBy(id = "esri-geolayers-widget")
	public WebElement GeoLayersList;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"esri-ui-top-right\")]/div[1]/div[2]/div[1]/div/span[1]")
	public WebElement LocationPopUpIconBack;
	
	
	
}
