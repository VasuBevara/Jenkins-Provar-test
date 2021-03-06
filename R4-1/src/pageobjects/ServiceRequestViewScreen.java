package pageobjects;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

import junit.framework.Assert;

@Page(connection = "SAT_Dev_Admin_311", summary = "ServiceRequestViewScreen")
public class ServiceRequestViewScreen {

	WebDriver driver;

	public ServiceRequestViewScreen(WebDriver driver) {
		this.driver = driver;
	}

	public void assertDateAndTime(String givenDateTimeFromExcel, String givenDateTimeFromSRDetails) {	
				
		String fromXLArray[] = givenDateTimeFromExcel.split(",");
		Assert.assertTrue(givenDateTimeFromSRDetails.toLowerCase().trim().contains(fromXLArray[0].toLowerCase().trim()));	
		Assert.assertTrue(givenDateTimeFromSRDetails.toLowerCase().trim().contains(fromXLArray[1].toLowerCase().trim()));	
	}
	
	public void assertTime(String givenTimeFromExcel, String givenTimeFromSRDetails) {
		Assert.assertEquals(givenTimeFromExcel + "m".toUpperCase().trim(), givenTimeFromSRDetails.trim());
	}
	
	public void assertMultiCSV(String givenCSVFromExcel, String givenCSVFromSRDetails) {
		List <String> fromXL = new ArrayList<String>();
		List <String> fromSR = new ArrayList<String>();
		
		List <String> parsedFromXL = new ArrayList<String>();
		List <String> parsedFromSR = new ArrayList<String>();
		
		String fromXLArray[] = givenCSVFromExcel.split(",");
		for(int i = 0; i < fromXLArray.length; i++){
			parsedFromXL.add(fromXLArray[i].toLowerCase().trim());
		}
		
		String fromSRArray[] = givenCSVFromSRDetails.split(",");
		for(int i = 0; i < fromSRArray.length; i++){
			parsedFromSR.add(fromSRArray[i].toLowerCase().trim());
		}
		
		boolean areAllPresent = parsedFromXL.containsAll(parsedFromSR);
		
		Assert.assertTrue(areAllPresent);
	}
	
	@ButtonType()
	@FindBy(xpath = "//*/div/a[1]/../../table[@class = 'list']/../div[1]/a[1]")
	public WebElement ShowMoreQuestions;
	@TextType()
	@FindBy(xpath = "//td[contains(text(), 'Transfer Parent')]/../td/div/a")
	public WebElement Incap311__Transfer_Parent__c;
	
	public void validateTransferParent(String SRNumber){
		WebElement ele = null;
		ele = driver.findElement(By.xpath("//a[contains(text(), '" + SRNumber +  "')]"));
		if (ele == null){
		Assert.fail();
		}
	}

	@LinkType()
	@FindBy(linkText = "New Service Request Creation")
	public WebElement newServiceRequestCreation;
	@LinkType()
	@FindBy(linkText = "Details0 of 9 questions answered")
	public WebElement details0Of9QuestionsAnswered;
	@TextType()
	@FindBy(xpath = "//h1[contains(@class, \"esri-popup__header-title\")]")
	public WebElement Selected_Location;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div[1]/div//input")
	public WebElement Contact_Search;
	@LinkType()
	@FindBy(linkText = "Test Vasuvbevara@incapsulate.com")
	public WebElement testVasuvbevaraIncapsulateCom;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"item-main\")]")
	public WebElement Contact_Search_Results;
	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00004972\"]/div//input")
	public WebElement This_is_a_test_Text_question;
	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00004973\"]/div//input")
	public WebElement This_is_a_test_Text_question_2;
	@LinkType()
	@FindBy(linkText = "Test Queue")
	public WebElement testQueue;
	@TextType()
	@FindBy(xpath = "//fieldset[contains(@class, \"picklist\")]/div[1]/label//span")
	public WebElement BackOffice_Godfather;
	@TextType()
	@FindBy(xpath = "//*[@id=\"500f200001L7itJ_RelatedCommentsList_body\"]/table/tbody/tr[2]//td[2]")
	public WebElement Case_Comments;
	@LinkType()
	@FindBy(linkText = "Details")
	public WebElement details;
	@TextType()
	@FindByLabel(label = "This is a Number field")
	public WebElement thisIsANumberField;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element\")]/div[2]//input")
	public WebElement thisIsANumberField_reallocate;
	@LinkType()
	@FindBy(linkText = "Submit Request")
	public WebElement submitRequest;
	@ButtonType()
	@FindByLabel(label = "Close")
	public WebElement close;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/div/div/div//div[2]")
	public WebElement New_Edit_Contact;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div/div/div[2]//*[name()=\"svg\"]")
	public WebElement contact_Click;
	@TextType()
	@FindBy(xpath = "//*[@id=\"FirstName\"]/div//input")
	public WebElement First_Name_Contact;
	@TextType()
	@FindBy(xpath = "//*[@id=\"LastName\"]/div//input")
	public WebElement Last_Name_Contact;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element\")]/div/div/input")
	public WebElement Phone_Contact;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-grid\")]/div[5]/div//input")
	public WebElement Email_Contact;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"slds-pill__remove\")]")
	public WebElement remove;
	@LinkType()
	@FindBy(xpath = "//nav[contains(@class, \"left-nav\")]//a[3]")
	public WebElement contactInformation;
	@TextType()
	@FindBy(xpath = "//*[@id=\"Name\"]/div//input")
	public WebElement Account_Name;
	@TextType()
	@FindBy(xpath = "//*[@id=\"BillingStreet\"]/div//input")
	public WebElement Account_Street;
	@TextType()
	@FindBy(xpath = "//*[@id=\"BillingPostalCode\"]/div//input")
	public WebElement Account_Zip;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element__control\")]/div/div[2]/div[4]/div//input")
	public WebElement Account_Phone;
	@TextType()
	@FindBy(id = "homeSearchFilter")
	public WebElement exploreCityServices;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-col\")]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]")
	public WebElement SR_searchResults;
	@TextType()
	@FindBy(xpath = "//p[contains(@class, \"empty-message\")]")
	public WebElement Search_Results;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"search-section\")]/div//button")
	public WebElement X_Icon_CancelSearch;
	@TextType()
	@FindBy(id = "searchServiceTypesFilter")
	public WebElement search;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"home-search-form\")]/div//button")
	public WebElement Home_SearchCancel;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div/div[1]/div//div[1]")
	public WebElement Search_Results1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div/div[1]")
	public WebElement Home_SR_SearchResults;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"knowledge-article\")]")
	public WebElement Home_Search_Knowledge;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"knowledge-section\")]/div//p")
	public WebElement Search_Results_Knowledge;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, \"slds-scrollable--y\")]/div//a[1]")
	public WebElement Home_Search_Location;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"esri-toggle-widget\"]/div//button[2]")
	public WebElement google;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"esri-ui-top-left\")]/div//span[1]")
	public WebElement Location_Layers_Icon;
	@TextType()
	@FindBy(xpath = "//p[contains(@class, \"slds-p-around--small\")]//b")
	public WebElement Location_Layers;
	
	@TextType()
	@FindBy(id = "esri-geolayers-widget")
	public WebElement GeoLayersList;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-grid\")]/div[2]/p")
	public WebElement Home_Search_Results_Locations;

}
