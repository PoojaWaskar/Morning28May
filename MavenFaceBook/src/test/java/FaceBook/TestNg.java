package FaceBook;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNg {
	
	private WebDriver driver;
	
	@Parameters("browser")
		
	@BeforeTest 
		public void openBrowser(String browserName) {
				
	    System.out.println(browserName);
	    if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}


	if(browserName.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pooja\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	
}

				
									
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void closeBrowser1() {
		System.out.println("After Test");
		driver.close();
	}
}

	
	
	


