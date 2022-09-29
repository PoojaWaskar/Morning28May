package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityLogin {
	
	 private WebDriver driver;
     private WebDriverWait wait;
      
     // Declaration
     
		@FindBy (xpath = "//input[@id = 'email']")  
		private WebElement userName;
		
		@FindBy (xpath = "//input[@id = 'pass']")
		private WebElement passWord;
		
		@FindBy (xpath = "//a[text() = 'Messenger']")
		private WebElement logInButton;
		
		
		//Initialization
		
		public UtilityLogin(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
			this.driver = driver;
			//wait = new WebDriverWait(driver,20);
			
		}
		
		//Use
		public void sendUserName(String username,String password)throws Exception {
			//wait = new WebDriverWait(driver,30);
			//wait.until(ExpectedConditions.visibilityOf(userName));
			userName.sendKeys(username);
			Thread.sleep(3000);
			passWord.sendKeys(password);
			Thread.sleep(9000);
		}
		
//		public void sendPassword(String password)throws Exception{
//			passWord.sendKeys(password);
//			Thread.sleep(3000);
//		}
			
		public void clickOnLogin() throws InterruptedException {	
			//wait.until(ExpectedConditions.visibilityOf(logInButton));
			logInButton.click();
			Thread.sleep(7000);
		}
		
}

		
	



