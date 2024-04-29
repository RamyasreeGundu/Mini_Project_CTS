package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel {
     public static WebElement element=null;
     public static WebElement drag(WebDriver driver) {
    	 element=driver.findElement(By.id("draggable"));
    	 return element;
     }
     public static WebElement drop(WebDriver driver) {
    	 element=driver.findElement(By.id("droppable"));
    	 return element;
     }
     public static WebElement dateTime(WebDriver driver) {
    	 element=driver.findElement(By.id("dateAndTimePickerInput"));
    	 return element;
     }
     public static WebElement time(WebDriver driver) {
    	 element=driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[1]/div"));
    	 return element;
     }
}
