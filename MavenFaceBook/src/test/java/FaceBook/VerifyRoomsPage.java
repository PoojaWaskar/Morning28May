package FaceBook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyRoomsPage {
	
	private WebDriver driver;
	private FaceBookPage1 faceBookPage1;
	private SoftAssert soft;
	private FaceBookPage2 faceBookPage2;
	private FaceBookPage3 faceBookPage3;
	private FaceBookPage4 faceBookPage4;
	private FaceBookPage5 faceBookPage5;
	 
	
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before class");
System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
        
        driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openRoomPage() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/"); 
		
		faceBookPage1 = new FaceBookPage1(driver);
		faceBookPage2 = new FaceBookPage2(driver);
		faceBookPage3 = new FaceBookPage3(driver);
		faceBookPage4 = new FaceBookPage4(driver);
		faceBookPage5 = new FaceBookPage5(driver);
		faceBookPage1.openMessenger();
		faceBookPage2.openRooms1();
		soft = new SoftAssert();
		//faceBookPage1.openRooms1();
	}
	
	@Test
	public void verifyReturnToMessengerButton() {
		System.out.println("Test1");
		faceBookPage3.goBackToMessenger();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);//https://www.messenger.com/
		//Messenger
		//soft.assertEquals(url,"https://www.messenger.com/","URL of messemger Page is");
		//soft.assertEquals(title,"Messenger","Title of Messenger Page is");
		Assert.assertEquals(url,"https://www.messenger.com/","URL of messemger Page is");
		//soft.assertAll();
		Assert.assertEquals(title,"Messenger","URL of messemger Page is");
		
		//In Assert if first condition get fail then no next condition is executed
		////In SoftAssert if first condition get fail then next condition is executed but for this we have to create its object
		
	}
	
	@ Test
	public void verifyToHelpCenter() {
		System.out.println("Test2");
		faceBookPage5.contactToHelpCenter();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
//		soft.assertEquals(url,"https://www.messenger.co/help","URL of Help Centre is");//failuer msg
//		soft.assertEquals(title,"Messenger Help Centre","Title of Help Centre is");
//		soft.assertAll();
		
		Assert.assertEquals(url,"https://www.messenger.com/help","URL of Help Centre is");//failuer msg
		Assert.assertEquals(title,"Messenger Help Centre","Title of Help Centre is");
	}
	
	@AfterMethod
	public void logoutFromApplication() {
		System.out.println("After Method");
		System.out.println("Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class ");
		driver.close();
	}
}


