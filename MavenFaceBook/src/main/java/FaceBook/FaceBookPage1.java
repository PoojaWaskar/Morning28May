package FaceBook;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookPage1 {
	
	       private WebDriver driver;
	       private WebDriverWait wait;
	        
	       // Declaration
	       
 			@FindBy (xpath = "//input[@id = 'email']")  
 			private WebElement userName;
			
         	@FindBy (xpath = "//input[@id = 'pass']")
 			private WebElement passWord;
			
 			//@FindBy (xpath = "//button[text() = 'Log In']")
 			//private WebElement logInButton;
			
 			//@FindBy (xpath = "//a[text() = 'Create New Account']")
 			//private WebElement createNewAccount;
			
 			@FindBy (xpath = "//a[text() = 'Messenger']")
 			private WebElement messenger;
			
 			@FindBy (xpath = "//a[text() = 'Rooms']")
 			private WebElement room;
			
 			@FindBy(xpath = "//a[text() = ' Return to messenger.com ']")
 			private WebElement returnToMessenger;
			
 			@FindBy(xpath = "//a[text() = ' Visit our help center ']")
 			private WebElement helpCenter;
			
			//Initialization
			
			public FaceBookPage1(WebDriver driver) {
				
				PageFactory.initElements(driver,this);
				
				
			}
			
			//Use
			public void sendUserName() {
				//wait = new WebDriverWait(driver,30);
				//wait.until(ExpectedConditions.visibilityOf(userName));
				userName.sendKeys("velocity123@gmail.com");
			}
			
			public boolean checkPasswordIsDisplayed() {
				//wait = new WebDriverWait(driver,30);
				//wait.until(ExpectedConditions.visibilityOf(passWord));
				return passWord.isDisplayed();
			}
			
			
			public void sendPassword() {
				passWord.sendKeys("12345678");
			}
			
			
			public void openMessenger() {
				//JavascriptExecutor js = (JavascriptExecutor)driver;
				//js.executeScript("arguments[0].scroolIntoView(true);",messenger);
				messenger.click();
			}
			
		
	}
