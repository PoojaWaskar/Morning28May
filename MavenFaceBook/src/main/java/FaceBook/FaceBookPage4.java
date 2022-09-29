package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage4 {
	
	@FindBy (xpath = "//a[text() = 'Rooms']")
	private WebElement room;
	
	
	//Initialization
	
			public FaceBookPage4(WebDriver driver) {
				
				PageFactory.initElements(driver,this);	
				
			}
			
			public void openRooms2() {
				room.click();
			}


}
