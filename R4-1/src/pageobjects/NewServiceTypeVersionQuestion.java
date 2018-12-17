package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="NewServiceTypeVersionQuestion"                                
     , summary=""
     , relativeUrl=""
     , connection="QA"
     )             
public class NewServiceTypeVersionQuestion {

	@TextType()
	@FindBy(xpath = "//td[@class=\"dataCol last col02\"]/div[@class=\"requiredInput\"]/span[@class=\"lookupInput\"]/input")
	public WebElement Incap311__Service_Type_Version__c;
	@TextType()
	@FindByLabel(label = "Question")
	public WebElement Incap311__Question__c;
	@TextType()
	@FindBy(xpath = "//h2[contains(@class, \"pageDescription\")]")
	public WebElement serviceTypeVersionQuestion;
			
}
