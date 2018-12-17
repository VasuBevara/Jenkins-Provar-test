package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Incap 311sc__ Agent Console"                                
               , summary=""
               , page="AgentConsole"
               , namespacePrefix="Incap311SC"
               , object="Case"
               , connection="QA"
     )             
public class incap311sc__AgentConsole {

	@LinkType()
	@FindBy(linkText = "Submit Request")
	public WebElement submitRequest;
	@TextType()
	@FindBy(id = "homeSearchFilter")
	public WebElement exploreCityServices;
	@TextType()
	@FindBy(xpath = "//div/div[1]/div/div[1]/strong[1]")
	public WebElement ServiceSearchResults;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"esri-ui-top-right\")]/div[1]/div[2]/div[1]/div/span[1]")
	public WebElement Lcation_Hide_Layers_List;
	@LinkType()
	@FindBy(linkText = "Details0 of 13 questions answered")
	public WebElement Details_Link;
	@TextType()
	@FindBy(xpath = "//nav[contains(@class, \"left-nav\")]/a[4]/span/span[2]/span")
	public WebElement Service_Details_Section;
	@VisualforceBy(componentXPath = "//*[@id=\"form-element-3d537070-6b10-4509-9b30-47e5735d79fe\"]")
	@ButtonType()
	public WebElement Priority;
	@LinkType()
	@FindBy(linkText = "High")
	public WebElement Priority_List_Values;
	@ButtonType()
	@FindBy(id = "form-element-243ebbeb-849e-4dcf-a386-2bd0ae803844")
	public WebElement Origin;
	@LinkType()
	@FindBy(linkText = "Phone")
	public WebElement Origin_LIst_Values;
	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00002539\"]/div/div/fieldset/div[1]/label/span")
	public WebElement Animal_Size;
	@TextType()
	@FindByLabel(label = "Phone flex question for testing", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement phoneFlexQuestionForTesting;
	@TextType()
	@FindBy(id = "input-69f60632-609b-4d96-9c2d-748c12ec7067")
	public WebElement Graffiti_Located_On_The_Property;
	@TextType()
	@FindBy(id = "form-element-ba68e4ff-2e9b-4c7c-932f-a1993869acb1")
	public WebElement Estimated_Defer_Date;
	@TextType()
	@FindByLabel(label = "This is related to currency data type question", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement thisIsRelatedToCurrencyDataTypeQuestion;
	@TextType()
	@FindBy(xpath = "//*[@id=\"STQ-00002549\"]/div/div/fieldset/div[1]/label/span")
	public WebElement WhatkindOfAnimalsAreOnSite;
	@TextType()
	@FindBy(id = "form-element-12c2f6e0-f8ae-4d15-962b-ffdb4c5d6081")
	public WebElement AdditionalDetails;
	@LinkType()
	@FindBy(linkText = "Location")
	public WebElement Service_Location;
	@TextType()
	@FindBy(id = "locationFilter")
	public WebElement searchForALocation;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"slds-box\")]")
	public WebElement Location_Search_Results;
	@LinkType()
	@FindBy(linkText = "Contact Information")
	public WebElement contactInformation;
	@TextType()
	@FindBy(id = "form-element-0d281859-0bbe-4ba8-9d43-7b857fd92cc0")
	public WebElement Contact_Search;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"slds-lookup__item-action\")]")
	public WebElement Contact_Search_Results;
	@TextType()
	@FindBy(id = "form-element-8c8bc82f-4e85-4183-8286-aab884240a0f")
	public WebElement Account_Search;
	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"slds-lookup__result-text\")]")
	public WebElement Account_Search_Results;
	@LinkType()
	@FindBy(linkText = "Files")
	public WebElement files;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"dropzone-message\")]//p")
	public WebElement File_Upload;
	@ButtonType()
	@FindByLabel(label = "Submit")
	public WebElement Submit_Button;
	@TextType()
	@FindBy(id = "form-element-ee4023b5-37f6-40b3-907e-69f835690aae")
	public WebElement standard;
	@TextType()
	@FindBy(id = "form-element-c497396d-39a5-4f4a-8b45-c0d4250e72e3")
	public WebElement selectAnOption;
	@TextType()
	@FindBy(css = "#form-element-286b1782-b677-44c5-8e86-94535a0a74c5")
	public WebElement standard_1;
	@TextType()
	@FindBy(xpath = "//div/div[1]/div[2]/div/div[2]/div[1]//input")
	public WebElement C_Search;
	@TextType()
	@FindBy(css = "#input-268b4ffc-8bbc-4d78-981f-ab0a0df1730e")
	public WebElement Graffiti_Located;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"date-picker\")]/div[2]/div[1]/div/div/input")
	public WebElement mMDDYYYY;
	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"slds-checkbox--faux\")]")
	public WebElement boolean_Question;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-col\")]/div/div/div[1]/div/div/input")
	public WebElement test_Datetime;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"slds-p-left--small\")]/div/div/span/input")
	public WebElement test_Datetime_Time;
	@TextType()
	@FindByLabel(label = "This is a time related question to test", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement thisIsATimeRelatedQuestionToTest;
	@ButtonType()
	@FindBy(css = "#form-element-3a88a5b9-a7e0-4e42-b19a-9aabfac7b87c")
	public WebElement selectAnOption_MultiPicklist;
	@LinkType()
	@FindBy(linkText = "Algeria")
	public WebElement algeria;
	@LinkType()
	@FindBy(linkText = "Slovakia")
	public WebElement slovakia;
	@TextType()
	@FindBy(css = "#form-element-a0bfa3d5-5e1b-47bf-ab49-1869cce4d359")
	public WebElement Additional_Details_123;
	
}
