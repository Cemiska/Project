package projekat_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forms {

	WebDriver driver;

	public Forms(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getHeader() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getFirstName() {
		return driver.findElement(By.id("firstName"));
	} 
	
	public WebElement getLastName() {
		return driver.findElement(By.id("lastName"));
	} 
	
	public WebElement getEmail() {
		return driver.findElement(By.id("userEmail"));
	} 
	
	public WebElement getMaleGender() {
		return driver.findElement(By.id("gender-radio-1"));
	} 
	
	public WebElement getFemaleGender() {
		return driver.findElement(By.id("gender-radio-2"));
	} 
	
	public WebElement getOtherGender() {
		return driver.findElement(By.id("gender-radio-3"));
	} 
	
	public WebElement getMobile() {
		return driver.findElement(By.id("userNumber"));
	} 
	
	public WebElement getDateOfBirth() {
		return driver.findElement(By.id("dateOfBirthInput"));
	} 
	
	
}
