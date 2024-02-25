package automation.ebay.initialzation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	WebDriver driver; // Webdriver is called and declared to driver
	
	public WebDriver driverinialization (String browser, String url )
	/* why we need to provide the return?, there is a query on this* method return and with argument*/ 
	{
		if(browser.equals("edge")) {
			System.setProperty("Webdriver.edge.driver", "Driver\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else {
			System.out.println("Browser not mentioned or Wrongly mentioned");
		}
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	
	public void quitbrowser() {
		driver.quit();
	}
}
