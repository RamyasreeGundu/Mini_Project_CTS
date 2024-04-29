package testscenarios;
import java.io.IOException;
import java.time.Duration;
import userDefinedLibraries.DriverSetup;
import userDefinedLibraries.ScreenShot;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.WebElement;

import pom.PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
public class DatePickerDemo extends DriverSetup {
	//Date and Time
	public static WebElement dateTime1,time1;
	public static void DateTimePicker(){
        JavascriptExecutor j=(JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,200)");
        dateTime1=PageObjectModel.dateTime(driver);
		dateTime1.click();
		j.executeScript("arguments[0].value='';", dateTime1);
		LocalDate nextDate=LocalDate.now().plusDays(1);
		String formatter=nextDate.format(DateTimeFormatter.ofPattern("MMMM d,yyyy"));
		dateTime1.sendKeys(formatter+" 06:00 AM");
		System.out.println("Modified date: "+formatter);
		 time1=PageObjectModel.time(driver);
		time1.click();
		System.out.println("Date modified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	//Screenshot
	public static void DatePickerScreenShot() throws IOException{
		try {
		ScreenShot.screenShotTC(driver,"output2");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot of datepicker is taken");
	}
}


