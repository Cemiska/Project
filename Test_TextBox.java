package projekat_tests;

import javax.swing.JScrollBar;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test_TextBox extends projekat_baza.Base {

	@BeforeMethod
	public void pageSetUp() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		mainPage.getElement().click();
		Thread.sleep(2000);
		
	}
	
	
	@Test (priority = 10) 
	public void testElements() throws InterruptedException {
		
		String name = excel.getStringData("Elements", 6, 4);
		String email = excel.getStringData("Elements", 8, 4);
		String currentAddress = excel.getStringData("Elements", 10, 4);
		String permanentAddress = excel.getStringData("Elements", 12, 4);

		
		WebDriverWait wdwait = new WebDriverWait(driver, 20);
		wdwait.until(ExpectedConditions.elementToBeClickable(By.id("item-0")));
		elements.getTextBox().click();
		elements.insertFullName(name);
		Thread.sleep(2000);
		elements.insertEmail(email);
		Thread.sleep(2000);
		elements.insertCurrentAddress(currentAddress);
		Thread.sleep(2000);
		elements.insertPermanentAddress(permanentAddress);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		elements.getSubmit().click();
		
		Assert.assertTrue(elements.getSubmitData().isDisplayed()); 		//verifies if inserted data are submitted
		Assert.assertTrue(elements.getHeader().getText().contains("Text Box"));			//verifies that item Text Box is opened
	}
	
	@AfterMethod
	public void pageClose() {
		driver.manage().deleteAllCookies();
	
	}
	
}
