package automation.ebay.resuablemethod;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class helpermethods {
	WebDriver driver;
	WebDriverWait wait;
	public ExtentSparkReporter esr;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	public helpermethods (WebDriver driver) {
    	this.driver= driver;
    	
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    	
    }
public void extentreport () {
		
		esr= new ExtentSparkReporter(new File(System.getProperty("user.dir")+"./Reports/EBAYreport"+dateandtime.getcurrentdate()+".html"));
		extent = new ExtentReports();
		extent.attachReporter(esr);
		extent.setSystemInfo("Test", "siddharth");
		esr.config().setDocumentTitle("LBA Report");
		esr.config().setReportName("Ebay Report");
	}
	
    
    
    public void click(By path, String reports) {
        try {
        	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(path))).click();
    	test.pass("clicked on"+reports);
    	}
    	catch (Exception e) {
    		test.fail("click funtion failed"+reports);
    		e.getMessage();
    	}
		}
    	
        public void sendKeys(By path, Keys txt, String reports) {
    		try {
    			driver.findElement(path).sendKeys(txt);
    			test.pass("Enterered text"+reports);
    		} catch (Exception e) {
    			test.fail(""+reports);
    			e.getMessage();
    		}
    	}
        
        public void clickable(By path) {
    		Actions a = new Actions(driver);
    		a.moveToElement(driver.findElement(path)).contextClick().build().perform();
    	}

       
}



















