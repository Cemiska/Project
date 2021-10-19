package projekat_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements_TextBox {

	WebDriver driver;

	public Elements_TextBox(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getElements() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div"));
	}
	
	public WebElement getTextBox() {
		return driver.findElement(By.id("item-0"));
	}
	
	public WebElement getHeader() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]"));
	}
	
	
	public WebElement getFullName() {
		return driver.findElement(By.id("userName"));
	}
	
	public void insertFullName(String name) {
		this.getFullName().click();
		this.getFullName().sendKeys(name);
	}
	
	public WebElement getEmail() {
		return driver.findElement(By.id("userEmail"));
	}
	
	public void insertEmail(String email) {
		this.getEmail().click();
		this.getEmail().sendKeys(email);
	}
	
	public WebElement getCurrentAddress() {
		return driver.findElement(By.id("currentAddress"));
	}
	
	public void insertCurrentAddress(String address1) {
		this.getCurrentAddress().click();
		this.getCurrentAddress().sendKeys(address1);
	}
	
	public WebElement getPermanentAddress() {
		return driver.findElement(By.id("permanentAddress"));
	}
	
	public void insertPermanentAddress(String address2) {
		this.getPermanentAddress().click();
		this.getPermanentAddress().sendKeys(address2);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(By.id("submit"));
	}
	
	public WebElement getSubmitData() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]"));
	}
	
}
