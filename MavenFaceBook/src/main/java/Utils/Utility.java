package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class Utility {
	
	public static void captureScreenshot(WebDriver driver,int testId)throws Throwable {
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String timeStamp = time.toString().replace(":"," ");
		
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destiny = new File ("C:\\Users\\pooja\\OneDrive\\Documents\\Selenium Screenshot"+testId+" "+timeStamp+".jpeg");
		FileHandler.copy(file, destiny);
		
	}
	
	public static String excelFetch(String sheet,int row,int cellvalue)throws Throwable {
		
		String path = ("C:\\Users\\pooja\\OneDrive\\Desktop\\TestNgExcelSheet.xlsx");
		FileInputStream file = new FileInputStream(path);
		Cell cell = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cellvalue);
		
		try {
			String data = cell.getStringCellValue();
			return data;
		}
		catch (Exception e) {
			double value = cell.getNumericCellValue();
			//int convertedValue = (int)value;
			String result = String.valueOf(value);
			return result;
		}
	}

}
