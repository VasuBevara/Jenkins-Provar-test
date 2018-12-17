package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ServiceRequestOutcomeQuestionPage"                                
     , summary=""
     , relativeUrl=""
     , connection="QA"
     )             
public class ServiceRequestOutcomeQuestionPage {

	@TextType()
	@FindByLabel(label = "Activity Outcome")
	public WebElement Incap311__Activity_Outcome__c;
	@TextType()
	@FindByLabel(label = "Question")
	public WebElement Incap311__Question__c;
	@TextType()
	@FindBy(xpath = "//h2[contains(@class, \"pageDescription\")]")
	public WebElement OutcomeQuestion;
	@TextType()
	@FindByLabel(label = "Service Type Version Activity Outcome")
	public WebElement Incap311__Service_Type_Version_Activity_Outcome__c;
			
}
