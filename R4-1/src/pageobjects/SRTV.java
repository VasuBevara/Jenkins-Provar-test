package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SRTV"                                
     , summary=""
     , relativeUrl=""
     , connection="Internal311Qa"
     )             
public class SRTV {

	@TextType()
	@FindByLabel(label = "Version Number")
	public WebElement versionNumber;
			
	@LinkType()
	@FindBy(linkText = "Responses")
	public WebElement responses;
	@LinkType()
	@FindBy(linkText = "Outcomes")
	public WebElement outcomes;
	@LinkType()
	@FindBy(linkText = "Responses")
	public WebElement responses1;
	@LinkType()
	@FindBy(linkText = "Outcomes")
	public WebElement outcomes1;
	@LinkType()
	@FindBy(linkText = "Activities")
	public WebElement activities;
	@LinkType()
	@FindBy(linkText = "Activities")
	public WebElement activities1;
	@TextType()
	@FindBy(xpath = "//h2[contains(@class, \"pageDescription\")]")
	public WebElement activityOutcomeResponseId;

	@TextType()
	@FindBy(xpath = "//div//div[@class=\"pShowMore\"]/a[1]")
	public WebElement Incap311__Service_Questions__r;

	@TextType()
	@FindBy(linkText = "[Change]")
	public WebElement OwnerId;

	@TextType()
	@FindBy(linkText = "[Change]")
	public WebElement OwnerId1;

	@ButtonType()
	@FindByLabel(label = "Service Request Creation")
	public WebElement serviceRequestCreation;

	@ButtonType()
	@FindBy(xpath = "//td[@class=\"x-btn-mc\"]/em[@class=\"x-btn-split\"][@id=\"ext-gen183\"]/*[@id=\"ext-gen33\"]")
	public WebElement serviceRequestCreation1;

	@TextType()
	@FindBy(xpath = "//tbody[@class=\"x-btn-small x-btn-icon-small-left\"]/tr[2]/td[@class=\"x-btn-mc\"]/em[@class=\"x-btn-split\"][@id=\"ext-gen183\"]")
	public WebElement ServiceRequest;

	@LinkType()
	@FindBy(linkText = "Service Requests")
	public WebElement serviceRequests;

	@TextType()
	@FindBy(xpath = "//tr[4]/td[@id=\"cas28_ilecell\"]/*[@id=\"cas28_ileinner\"]")
	public WebElement ParentId;

	@TextType()
	@FindBy(xpath = "//div[2]/table/tbody/tr[4]/td[@id=\"cas28_ilecell\"]/*[@id=\"cas28_ileinner\"]")
	public WebElement ParentId1;

	@BooleanType()
	@FindBy(xpath = "//div[@class=\"inlineEditDiv\"]/input[@type=\"checkbox\"]")
	public WebElement Incap311__Is_Bulk_Type__c;

	@TextType()
	@FindBy(id = "00N4100000RERl8")
	public WebElement Incap311__Schedule_Type__c;

	@TextType()
	@FindBy(xpath = "//span[@class=\"lookupInput\"]/input[@type=\"text\"]")
	public WebElement ServiceTypeNumber;
}
