package automation.ebay.testrunner;

import org.testng.annotations.Test;

public class loginpagerunner extends Baserunner {
	
	@Test
	
	public void clickonsignin_test_1() throws InterruptedException {
		log.info("Test Case Started");
		execution.test=execution.extent.createTest("Log validation");
		Thread.sleep(2000);
		execution.signinlink();
		
	}

	@Test
	public void Username_test_2() throws InterruptedException {
		log.info("Test Case Started");
		execution.test=execution.extent.createTest("Log validation");
		Thread.sleep(2000);
		execution.signinlink();
		execution.enterusername();
		
	}
	
	@Test
	public void password_test_3() throws InterruptedException {
		log.info("Test Case Started");
		execution.test=execution.extent.createTest("Log validation");
		Thread.sleep(2000);
		execution.signinlink();
		execution.enterusername();
		execution.enterpassword();
		Thread.sleep(3000);
	}
	
}
