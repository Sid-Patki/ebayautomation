package automation.ebay.utilities;
import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import automation.ebay.resuablemethod.dateandtime;

public class Reportgeneration {
	
	public ExtentSparkReporter esr;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void extentreport () {
		
		esr= new ExtentSparkReporter(new File(System.getProperty("user.dir")+"./Reports/EBAYreport"+dateandtime.getcurrentdate()+".html"));
		extent = new ExtentReports();
		extent.attachReporter(esr);
		extent.setSystemInfo("Test", "siddharth");
		esr.config().setDocumentTitle("LBA Report");
		esr.config().setReportName("Ebay Report");
	}
      
	
	
}
