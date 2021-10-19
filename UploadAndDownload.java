package projekat_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownload {
	
	WebDriver driver;

	public UploadAndDownload(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getUploadAndDownload() {
		return driver.findElement(By.id("item-7"));
	}
	
	public WebElement getHeader() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getDownload() {
		return driver.findElement(By.id("downloadButton"));
	}
	
	public WebElement getChooseFile() {
		return driver.findElement(By.id("uploadFile"));
	}
	
	public WebElement getFilePath() {
		return driver.findElement(By.id("uploadedFilePath"));
	}
}
