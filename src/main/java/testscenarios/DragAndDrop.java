package testscenarios;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import userDefinedLibraries.DriverSetup;
import userDefinedLibraries.ScreenShot;
import pom.PageObjectModel;

public class DragAndDrop extends DriverSetup{
	//Drag and drop element from source to destination
	 public static WebElement drag1,drop1;
	 
	     public static void DragDropDemo(){
	     PageObjectModel.drag(driver);
		 drag1=PageObjectModel.drag(driver);
    	  drop1=PageObjectModel.drop(driver);
    	 JavascriptExecutor j=(JavascriptExecutor)driver;
		 j.executeScript("window.scrollBy(0,200)");
    	 Actions action=new Actions(driver);
    	 action.dragAndDrop(drag1,drop1).build().perform();
    }
         //Verifying dropped text
    	 public static void verify() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='simpleDropContainer'] p")));
         if(ele.isDisplayed()) {
			System.out.println("Droppedtext is matched");
		}
		else {
			System.out.println("Failed");
		}
    }
	 //Screenshot
	 public static void DragDropScreenshot() throws IOException{
		 try {
    	 ScreenShot.screenShotTC(driver,"output1");
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }
    	 System.out.println("Drag and drop screenshot is taken");
    }
}




