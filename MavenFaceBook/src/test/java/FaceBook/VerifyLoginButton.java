package FaceBook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import Utils.Utility;

public class VerifyLoginButton {
	
	private WebDriver driver;
	private UtilityLogin utilityLogin;
	private SoftAssert soft;
	int testId;
	
//	@Parameters("browser")
//	@BeforeTest 
//	public void openBrowser(String browserName) {
//			
//     System.out.println(browserName);
//			
//	 if(browserName.equals("Chrome"))
//	 {
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	 }
//	 if(browserName.equals("Firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver","C:\\Users\\pooja\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\geckodriver.exe");
//			driver = new FirefoxDriver();
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		}
//			
//
//			
//		}
	
	@BeforeClass
	public void openBrowser() throws InterruptedException{
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		utilityLogin = new UtilityLogin(driver);
		soft = new SoftAssert();
		
	}
	
	@BeforeMethod
	public void openLoginPage() throws Throwable {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		String userName = Utility.excelFetch("TestNgExcel",1, 1);
		String passWord = Utility.excelFetch("TestNgExcel",2,2);
		//utilityLogin = new UtilityLogin(driver);
		utilityLogin.sendUserName(userName, passWord);
		Thread.sleep(3000);
		
	}
	
	@Test()
	public void VerifyLoginIn() throws Throwable {
	    testId = 12345;
		
		utilityLogin.clickOnLogin();
		Thread.sleep(3000);

		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		soft.assertEquals(url,"https://www.messenger.com/");
		soft.assertEquals(title,"Messenger");
		soft.assertAll();
		
	}
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws Throwable {
		//System.out.println("After Method");
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreenshot(driver,+testId);
		}
	}
			
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class ");
		driver.close();
		utilityLogin= null;
	}
}
	
//	@AfterTest
//	public void closeBrowser1() {
//		System.out.println("After Test");
//		driver.close();
//		driver = null;
//		System.gc();
	//}




