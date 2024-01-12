package automation.ebay.testrunner;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.MediaEntityBuilder;

import org.apache.logging.log4j.Logger;
import automation.ebay.initialzation.BaseClass;
import automation.ebay.pageobject.loginpageobject;
import automation.ebay.utilities.Readexcelfile;
import automation.ebay.utilities.ReadpropertyConfigfile;
import automation.ebay.utilities.Readscreenshot;

public class Baserunner {

	static WebDriver driver = null;
	static BaseClass browser;
	static Readexcelfile excel;
	static ReadpropertyConfigfile launch;
	static loginpageobject execution;
	public static Logger log = LogManager.getLogger(Baserunner.class);

	@BeforeSuite
	public void beforesuite() {
		launch = new ReadpropertyConfigfile();
		browser = new BaseClass();
		log.info("Initializing All the methods");
	}

	@BeforeMethod

	public void setup() {
		driver = browser.driverinialization(launch.getbrowser(), launch.geturl());
		execution = new loginpageobject(driver);
		execution.extentreport();
	}
	@AfterMethod
	
	public void teardownmethod(ITestResult ebayresult) {
		
		if (ebayresult.getStatus()==ITestResult.FAILURE) {
			execution.test.fail(ebayresult.getName()+"Test Failed",
		MediaEntityBuilder.createScreenCaptureFromPath(Readscreenshot.captureScreenShot(driver)).build());
			log.warn("This test Failed" +ebayresult.getName()+"Captured Screenshot" );
		}
		execution.extent.flush();
		driver.close();
	}
	@AfterSuite
	
	public void teardown() {
		driver.quit();
	}
	
}