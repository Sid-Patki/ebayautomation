package automation.ebay.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import automation.ebay.resuablemethod.dateandtime;

public class Readscreenshot {
	
	public static String captureScreenShot(WebDriver driver) {
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);/*investigatemore*/
		
		String screenShotPath= "./Reports/Screenshot/snapshot"+dateandtime.getcurrentdate()+".png";
		
		try {
			FileHandler.copy(screenshot, new File(screenShotPath));
		} catch (IOException e) {
			
			System.out.println("unable to capture Screenshot"+ e.getMessage());
		}
         return  "../Reports/Screenshot/snapshot"+dateandtime.getcurrentdate()+".png";
	}

}
