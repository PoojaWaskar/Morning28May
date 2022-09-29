package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage5 {
	
	@FindBy(xpath = "//a[text() = ' Visit our help center ']")
	private WebElement helpCenter;
	
	//Initialization
	
	public FaceBookPage5(WebDriver driver) {
		
		PageFactory.initElements(driver,this);	
		
	}
		
	public void contactToHelpCenter() {
		helpCenter.click();
	}
	


}
