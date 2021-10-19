package projekat_tests;



import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test_RadioButton extends projekat_baza.Base {

	@BeforeMethod
	public void pageSetUp() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		mainPage.getElement().click();
		Thread.sleep(2000);
	}
	
	@Test
	public void testRadioButton() throws InterruptedException {
		
		radioButton.getRadioButton().click();
		Thread.sleep(2000);
		radioButton.getYes().click();
		Thread.sleep(2000);
		radioButton.getImpressive().click();
		
		Assert.assertTrue(radioButton.getHeader().getText().contains("Radio Button")); //verifies that Radio Button option is clicked
		Assert.assertTrue(radioButton.getTextYes().isDisplayed());			//verifies that button yes is clicked
		Assert.assertTrue(radioButton.getTextImpressive().isDisplayed()); 	//verifies that button impressive is clicked
	}
	
}
