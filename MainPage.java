package projekat_pages;

//class with elements of main page of website https://demoqa.com/  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	public WebDriver driver;

	public MainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getElement() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
	}
	
	public WebElement getElementHeader() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getForms() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));
	}
	
	public WebElement getFormsHeader() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getAlertsFrameAndWindows() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
	}
	
	public WebElement getAlertsFrameAndWindowsHeader() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getWidgets() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));
	} 
	
	public WebElement getWidgetsHeader() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getInteractions() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]"));
	} 
	
	public WebElement getInteractionsHeader() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getBookStore() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]"));
	} 
	
	public WebElement getBookStoreHeader() {
		return driver.findElement(By.className("main-header"));
	}
	
	
}
