package testscenarios;
import java.io.IOException;
import userDefinedLibraries.DriverSetup;

public class MiniProject extends DriverSetup{
	public static String browsertype="chrome";
	public static void main(String[] args)throws IOException, InterruptedException {
		DriverSetup.driverInstantiate(browsertype);
		DragAndDrop.DragDropDemo();
		DragAndDrop.verify();
		DragAndDrop.DragDropScreenshot();
		DriverSetup.driverInstantiate2(browsertype);
		DatePickerDemo.DateTimePicker();
		DatePickerDemo.DatePickerScreenShot();
		DriverSetup.driverQuit();
	}
}