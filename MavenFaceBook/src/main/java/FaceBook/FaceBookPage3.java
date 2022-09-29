package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage3 {
	
	@FindBy(xpath = "//a[text() = ' Return to messenger.com ']")
	private WebElement returnToMessenger;
	
	//Initialization
	
		public FaceBookPage3(WebDriver driver) {
			
			PageFactory.initElements(driver,this);	
			
		}
		
		public void goBackToMessenger() {
			returnToMessenger.click();
		}
		
		
}
