package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage2 {
	
	@FindBy (xpath = "//a[text() = 'Rooms']")
	private WebElement room;
	
	
	
	
	//Initialization
	
	public FaceBookPage2(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	public void openRooms1() {
		room.click();
	}
	
	


}



	


