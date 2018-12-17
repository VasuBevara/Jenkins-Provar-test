package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SR_Contacts_Page"                                
     , summary=""
     , relativeUrl=""
     , connection="SAT_Dev_Admin_311"
     )             
public class SR_Contacts_Page {

	@TextType()
	public WebElement requiredFirstName;
	@TextType()
	@FindBy(xpath = "//*[@id=\"FirstName\"]/div/div/div/div/input")
	public WebElement FirstName;
	@TextType()
	@FindBy(xpath = "//*[@id=\"LastName\"]/div/div/div/div/input")
	public WebElement LastName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-form-element\")]/div/div/input")
	public WebElement Phone;
	@TextType()
	@FindBy(xpath = "//*[@id=\"Email\"]/div/div/div/div/input")
	public WebElement Email;
			
}
