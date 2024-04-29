package userDefinedLibraries;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class ScreenShot {
	public static String filepath = "C:\\Users\\2327200\\eclipse-workspace\\DragDropDatePicker\\ProjScreenshots\\";
	public static void screenShotTC(WebDriver driver,String fileName)throws IOException{
		DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy h-m-s");
        Date date = new Date();
        TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);  
		try
		{  // now copy the  screenshot to desired location using copyFile method
			FileUtils.copyFile(src, new File(filepath+fileName+"_"+dateFormat.format(date)+".png"));
        }catch (IOException e)      
			{
        		System.out.println(e.getMessage());      
			}
	  }

}
