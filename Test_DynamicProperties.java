package projekat_tests;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Test_DynamicProperties extends projekat_baza.Base {

	@BeforeMethod
	public void pageSetUp() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		mainPage.getElement().click();
		Thread.sleep(2000);
	}
	
	@Test
	public void testButtons() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("item-8"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		dynamicProp.getDynamicProperties().click();
		
		Assert.assertFalse(dynamicProp.getEnableAfter().isEnabled());		//verifies that button is not immediately enabled 
		
		WebDriverWait wdwait = new WebDriverWait(driver, 5);
		wdwait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));  	
		Assert.assertTrue(dynamicProp.getVisibleAfter().isDisplayed());		//verifies that button is displayed after 5 seconds
		
		dynamicProp.getColorChange();
		String s1 = dynamicProp.getPrimaryColor().getCssValue("color");
		String s2 = dynamicProp.getColorChange().getCssValue("color");
		
		System.out.println("Primary color is: " + s1);
		System.out.println("New color is: " + s2);
		
		Assert.assertNotEquals(s1, s2); 		//verifies that text colors of button are different before and after 5 seconds

	}
	
	
	@AfterMethod
	public void pageClose() {
		driver.manage().deleteAllCookies();
	}
	
}
