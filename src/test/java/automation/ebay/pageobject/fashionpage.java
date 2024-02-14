package automation.ebay.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import automation.ebay.resuablemethod.helpermethods;
import automation.ebay.uistore.Loginpageobjectui;
import automation.ebay.uistore.Searchpageui;
import automation.ebay.uistore.fashionpageui;

public class fashionpage extends helpermethods {

	WebDriver driver;

	public fashionpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void Backpack() {
		
		WebElement hoverfashion = driver.findElement(fashionpageui.fashionpagelink);
		Actions a = new Actions(driver);
		a.moveToElement(hoverfashion).perform();
		WebElement menacces = driver.findElement(fashionpageui.menaccesories);
		menacces.click();
		WebElement baglink = driver.findElement(fashionpageui.baglink);
		baglink.click();
		WebElement allfilters= driver.findElement(fashionpageui.filterlink);
		allfilters.click();
		WebElement backpack= driver.findElement(fashionpageui.Backpack);
		backpack.click();
		WebElement apply= driver.findElement(fashionpageui.Apply);
		apply.click();
	}

}
