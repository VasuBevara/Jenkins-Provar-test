package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CaseViewScreen"                                
     , summary=""
     , relativeUrl=""
     , connection="SAT_Dev_Admin_311"
     )             
public class CaseViewScreen {

	@TextType()
	@FindBy(xpath = "//*[@id=\"00Nf2000009Ovzh_ileinner\"]")
	public WebElement Service_Request_ID;
	@LinkType()
	@FindBy(linkText = "Submit Request")
	public WebElement submitRequest;
	@TextType()
	@FindBy(id = "00Nf2000009Ovzh_ileinner")
	public WebElement Service_Request_ID_1;
			
}
