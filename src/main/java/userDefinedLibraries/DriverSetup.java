package userDefinedLibraries;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class DriverSetup{
	public static WebDriver driver;
	public static String url1="https://demoqa.com/droppable";
	public static String url2="https://demoqa.com/date-picker";
	public static String browsertype;
	public static WebDriver driverInstantiate(String browser) {
		browsertype=browser;
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.get(url1);
		driver.manage().window().maximize();
		
		return driver;
	}
	public static void driverQuit() {
		driver.quit();
	}
	public static WebDriver driverInstantiate2(String browser) {
		browsertype=browser;
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.get(url2);
		driver.manage().window().maximize();
		
		return driver;
	}
	
}