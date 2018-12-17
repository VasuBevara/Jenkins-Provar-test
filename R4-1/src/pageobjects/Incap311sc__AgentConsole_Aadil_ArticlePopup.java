package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Incap311sc__AgentConsole_Aadil_ArticlePopup"                                
     , summary=""
     , relativeUrl=""
     , connection="QA"
     )             
public class Incap311sc__AgentConsole_Aadil_ArticlePopup {

	@TextType()
	@FindBy(xpath = "//h2[contains(@class, \"pageDescription\")]")
	public WebElement ARticle_Name;
			
}
