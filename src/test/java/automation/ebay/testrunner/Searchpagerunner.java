package automation.ebay.testrunner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.ebay.pageobject.searchpage;
import automation.ebay.uistore.Searchpageui;

public class Searchpagerunner extends Baserunner {
	
	@Test
	
	public void Searchpage_test_1() throws InterruptedException {
		
		searchpage searchobject = new searchpage(driver);
		log.info("Search object test case");
		execution.test=execution.extent.createTest("Search Laptop");
		Thread.sleep(2000);
		searchobject.searchitem();
		execution.highlight(Searchpageui.laptopcost);
		
		
	}

	@Test
	public void Username_test_2() throws InterruptedException {
		log.info("Test Case Started");
		execution.test=execution.extent.createTest("Log validation");
		Thread.sleep(2000);
		execution.signinlink();
		execution.enterusername();
		
	}
	
	
	
}
