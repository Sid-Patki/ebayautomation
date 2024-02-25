package automation.ebay.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import automation.ebay.resuablemethod.helpermethods;
import automation.ebay.uistore.Loginpageobjectui;
import automation.ebay.uistore.Searchpageui;

public class searchpage extends helpermethods {

	WebDriver driver;

	public searchpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void searchitem() {
		
		
		WebElement searchitem = driver.findElement(Searchpageui.Searchbuttontexbox);
		searchitem.sendKeys("Dell Laptop");
		WebElement clicksearch = driver.findElement(Searchpageui.Searchbutton);
		clicksearch.click();
		String expectedlaptopname= driver.findElement(By.xpath("(//div[@class=\"s-item__title\"])[2]")).getText();
		System.out.println(expectedlaptopname);
		String expectedlaptopcost= driver.findElement(By.xpath("(//span[@class=\"s-item__price\"])[2]")).getText();
		System.out.println(expectedlaptopcost);
		//String actuallaptopcost ="$189.00";
		//Assert.assertEquals(actuallaptopcost, expectedlaptopcost);
		

	}

}
