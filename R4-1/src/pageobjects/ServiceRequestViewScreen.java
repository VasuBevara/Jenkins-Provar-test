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

@Page(title = "Service Request View Screen", summary = "ServiceRequestViewScreen", relativeUrl = "", connection = "QA")
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

}
