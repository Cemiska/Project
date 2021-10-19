package projekat_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicProperties {

	WebDriver driver;

	public DynamicProperties(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getDynamicProperties() {
		return driver.findElement(By.id("item-8"));
	}
	
	public WebElement getEnableAfter() {
		return driver.findElement(By.id("enableAfter"));
	}
	
	public WebElement getPrimaryColor() {
		return driver.findElement(By.className("btn-primary"));
	}
	
	public WebElement getColorChange() {
		return driver.findElement(By.id("colorChange"));
	}
	
	public WebElement getVisibleAfter() {
		return driver.findElement(By.id("visibleAfter"));
	}
	
	
}
