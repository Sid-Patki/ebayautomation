package automation.ebay.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.ebay.resuablemethod.helpermethods;
import automation.ebay.uistore.Loginpageobjectui;
import automation.ebay.uistore.Searchpageui;

public class loginpageobject extends helpermethods {

	WebDriver driver;

	public loginpageobject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void signinlink() {

		WebElement clickonsignin = driver.findElement(Loginpageobjectui.clickonsigninlink);
		click(Loginpageobjectui.clickonsigninlink, "");

	}

	public void enterusername() {

		WebElement clickontextbox = driver.findElement(Loginpageobjectui.clickontextbox);
		clickontextbox.click();
		clickontextbox.sendKeys("siddharth.patki101@gmail.com");
		click(Loginpageobjectui.clickoncontinuebutton, "");

	}

	public void enterpassword() {
		

		WebElement clickonpasswordtextbox = driver.findElement(Loginpageobjectui.clickonpasswordtextbox);
		clickonpasswordtextbox.click();
		clickonpasswordtextbox.sendKeys("Hoby86#1");
		click(Loginpageobjectui.clickonsignbutton,"");
		WebElement searchitem = driver.findElement(Searchpageui.Searchbuttontexbox);
		searchitem.sendKeys("Dell Laptop");
		WebElement clicksearch = driver.findElement(Searchpageui.Searchbutton);
		clicksearch.click();
	

	}

}
