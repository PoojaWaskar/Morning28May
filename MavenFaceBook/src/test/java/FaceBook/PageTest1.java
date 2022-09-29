package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTest1 {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver(); 

        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        
        FaceBookPage1 page1 = new FaceBookPage1(driver);
        page1.sendUserName();
        page1.sendPassword();
        
        if(page1.checkPasswordIsDisplayed()==true)
        {
        	System.out.println("Displayed");
          	
        }
        else
        {
        	System.out.println("Not Displayed");
        }
        page1.openMessenger();
        Thread.sleep(5000);
        
   

        
        
        //FaceBookPage1 page3 = new FaceBookPage1(driver);
        //page1.clickOnloginButton();
        
        //FaceBookPage1 page4 = new FaceBookPage1(driver);
        //page1.clickOnCreateNewAcc();
        

        
        
        
        //FaceBookPage2 page21 = new FaceBookPage2(driver);
        //page21.openRooms();
        
        //FaceBookPage2 page22 = new FaceBookPage2(driver);
        //page21.openFeature();
        //Thread.sleep(5000);
        
        //FaceBookPage3 page31 = new FaceBookPage3(driver);
        //page31.goBackToMessenger();
        //page31.openRooms();
        //page31.contactToHelpCenter();
        
        
	}
}
	
	