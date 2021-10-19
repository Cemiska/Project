package projekat_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTables {

	WebDriver driver;

	public WebTables(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getWebTables() {
		return driver.findElement(By.id("item-3"));
	}
	
	public WebElement getAdd() {
		return driver.findElement(By.id("addNewRecordButton"));
	}
	
	public WebElement getFirstName() {
		return driver.findElement(By.id("firstName"));
	}
	
	public void insertFirstName(String name) {
		this.getFirstName().clear();
		this.getFirstName().sendKeys(name);
	}
	
	public WebElement getLastName() {
		return driver.findElement(By.id("lastName"));
	}
	
	public void insertLastName(String surname) {
		this.getLastName().clear();
		this.getLastName().sendKeys(surname);
	}
	
	public WebElement getUserEmail() {
		return driver.findElement(By.id("userEmail"));
	}
	
	public void insertUserEmail(String email) {
		this.getUserEmail().clear();
		this.getUserEmail().sendKeys(email);
	}
	
	public WebElement getAge() {
		return driver.findElement(By.id("age"));
	}
	
	public void insertAge(String  age) {
		this.getAge().clear();
		this.getAge().sendKeys(age);
	}
	
	public WebElement getSalary() {
		return driver.findElement(By.id("salary"));
	}
	
	public void insertSalary(String salary) {
		this.getSalary().clear();
		this.getSalary().sendKeys(salary);
	}
	
	public WebElement getDepartment() {
		return driver.findElement(By.id("department"));
	}
	
	public void insertDepartment(String department) {
		this.getDepartment().clear();
		this.getDepartment().sendKeys(department);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(By.id("submit"));
	}
	
	
	public WebElement getSearch() {
		return driver.findElement(By.id("searchBox"));
	}
	
	public void insertData(String data) {
		this.getSearch().clear();
		this.getSearch().sendKeys(data);
	}
	
	public WebElement getEdit() {
		return driver.findElement(By.id("edit-record-1"));
	}
	
	public WebElement getDelete() {
		return driver.findElement(By.id("delete-record-1"));
	}
	
	public WebElement getHeader() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]"));
	}
	
	
}
