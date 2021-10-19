package projekat_tests;

import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Test_Buttons extends projekat_baza.Base {

	@BeforeMethod
	public void pageSetUp() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		mainPage.getElement().click();
		Thread.sleep(2000);
	}
	
	@Test
	public void testButtons() {
		
		buttons.getButtons().click();
		
		Actions act = new Actions(driver);
		act.doubleClick(buttons.getDoubleClick());
		act.contextClick(buttons.getRightClick()).perform();
		buttons.getClickMe().click();
		
		Assert.assertTrue(buttons.getDoubleClickMessage().isDisplayed());	//verifies that a double click is executed
		Assert.assertTrue(buttons.getRightClickMessage().isDisplayed());	//verifies that a right click is executed
		Assert.assertTrue(buttons.getDynamicClickMessage().isDisplayed());	//verifies that a left click is executed
	}

	
	@AfterMethod
	public void pageClose() {
		driver.manage().deleteAllCookies();
	}
	
}
