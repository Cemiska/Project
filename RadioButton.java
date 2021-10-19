package projekat_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

	WebDriver driver;

	public RadioButton(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getRadioButton() {
		return driver.findElement(By.id("item-2"));
	}
	
	public WebElement getHeader() {
		return driver.findElement(By.xpath("//div[contains(text(),'Radio Button')]"));
	}
	
	public WebElement getYes() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]"));
	}
	
	public WebElement getTextYes() {
		return driver.findElement(By.className("mt-3"));
	}
	
	public WebElement getImpressive() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]"));
	}
	
	public WebElement getTextImpressive() {
		return driver.findElement(By.className("mt-3"));
	}
	
	
	
}
