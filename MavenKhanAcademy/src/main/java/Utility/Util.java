package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Util {
	public static void captureScreenshot(WebDriver driver, int testID) throws IOException {
	

	Date d = new Date();
	SimpleDateFormat x =new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
	String time =x.format(d);
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\Desktop\\New folder\\Screenshot"+testID+time+".png");
		FileHandler.copy(src,dest);
	}

}
