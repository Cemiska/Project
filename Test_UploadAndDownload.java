package projekat_tests;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test_UploadAndDownload extends projekat_baza.Base{

	@BeforeMethod
	public void pageSetUp() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		mainPage.getElement().click();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void testDownloadUpload() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("item-7"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		uploadDownload.getUploadAndDownload().click();
		uploadDownload.getDownload().click();
		uploadDownload.getChooseFile().sendKeys("C:\\Users\\Slavisa\\Desktop\\QA\\CV\\Screenshot_HOLYCODE.png");
		
		Assert.assertTrue(uploadDownload.getHeader().isDisplayed()); 	//verifies that we are on page "Download and Upload"
		Assert.assertTrue(uploadDownload.getFilePath().isDisplayed());	//verifies that we uploaded file
	}
	
	
	@AfterMethod
	public void pageClose() {
		driver.manage().deleteAllCookies();
	}
}
