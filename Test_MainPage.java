package projekat_tests;

//testing that elements on main page are clickable

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Test_MainPage extends projekat_baza.Base {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		
	}
	
	@Test (priority = 10) 
	public void testElementsButton() {
		mainPage.getElement().click();
		
		Assert.assertTrue(mainPage.getElementHeader().isDisplayed());	//verifies if we are an page Elements by finding title "Elements"
		Assert.assertTrue(mainPage.getElementHeader().getText().contains("Elements")); // verifies if header contains text "Elements"
	}

	
	@Test (priority = 20) 
	public void testFormsButton() {
		mainPage.getForms().click();
		
		Assert.assertTrue(mainPage.getElementHeader().isDisplayed());	//verifies if we are an page Forms by finding title "Forms"
		Assert.assertTrue(mainPage.getElementHeader().getText().contains("Forms")); //verifies if header contains text "Forms"
	}
	
	@Test (priority = 30) 
	public void testAlertFrameAndWindowsButton() {
		mainPage.getAlertsFrameAndWindows().click();
		
		Assert.assertTrue(mainPage.getElementHeader().isDisplayed());	//verifies if we are an page Alert, Frame and Windows Button by finding title "Alert, Frame and Windows Button"
		Assert.assertTrue(mainPage.getElementHeader().getText().contains("Alerts, Frame & Windows"));	// verifies if header contains text "Alert, Frame and Windows Button"
	}
	
	@Test (priority = 40) 
	public void testWidgetsButton() {
		mainPage.getWidgets().click();
		
		Assert.assertTrue(mainPage.getElementHeader().isDisplayed());	//verifies if we are an page Widgets Button by finding title "Widgets Button"
		Assert.assertTrue(mainPage.getElementHeader().getText().contains("Widgets"));	//verifies if header contains text "Widgets Button"
	}
	
	@Test (priority = 50) 
	public void testInteractionsButton() {
		mainPage.getInteractions().click();
		
		Assert.assertTrue(mainPage.getElementHeader().isDisplayed());	//verifies if we are an page Interactions Button by finding title "Interactions Button"
		Assert.assertTrue(mainPage.getElementHeader().getText().contains("Interactions")); 	//verifies if header contains text "Interactions Button"
	}
	
	@Test (priority = 60) 
	public void testBookStoreButton() {
		mainPage.getBookStore().click();
		
		Assert.assertTrue(mainPage.getElementHeader().isDisplayed());	//verifies if we are an page Book Store Button by finding title "Book Store Button"
		Assert.assertTrue(mainPage.getElementHeader().getText().contains("Book Store")); 	//verifies if header contains text "Book Store Button"
	}
	
	@AfterMethod
	public void pageClose() {
		
		driver.manage().deleteAllCookies();
	
	}
}
