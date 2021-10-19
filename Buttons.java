package projekat_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buttons {

	WebDriver driver;
	
	public Buttons(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getButtons() {
		return driver.findElement(By.id("item-4"));
	}
	
	public WebElement getDoubleClick() {
		return driver.findElement(By.id("doubleClickBtn"));
	}
	
	public WebElement getRightClick() {
		return driver.findElement(By.id("rightClickBtn"));
	}
	
	public WebElement getClickMe() {
		return driver.findElement(By.xpath("//button[@id='zUQEz']"));
	}
	
	public WebElement getDoubleClickMessage() {
		return driver.findElement(By.id("doubleClickMessage"));
	}
	
	public WebElement getRightClickMessage() {
		return driver.findElement(By.id("rightClickMessage"));
	}
	
	public WebElement getDynamicClickMessage() {
		return driver.findElement(By.id("dynamicClickMessage"));
	}
	
	
}
