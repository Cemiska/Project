package projekat_tests;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test_WebTables extends projekat_baza.Base {

	@BeforeMethod
	public void pageSetUp() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		mainPage.getElement().click();
		Thread.sleep(2000);
	}
	
	@Test (priority = 10)
	public void testRegistrationForm() {
		
		webTable.getWebTables().click();
		webTable.getAdd().click();
		
		String firstName = excel.getStringData("WebTables", 5, 4);
		String lastName = excel.getStringData("WebTables", 6, 4);
		String email = excel.getStringData("WebTables", 7, 4);
		String age = excel.getStringData("WebTables", 8, 4);
		String salary = excel.getStringData("WebTables", 9, 4);
		String department = excel.getStringData("WebTables", 10, 4);
		
		webTable.insertFirstName(firstName);
		webTable.insertLastName(lastName);
		webTable.insertUserEmail(email);
		webTable.insertAge(age);
		webTable.insertSalary(salary);
		webTable.insertDepartment(department);
		
		webTable.getSubmit().click();
		
		Assert.assertTrue(webTable.getHeader().isDisplayed()); 	//verifies that page "Web Tables" is displayed
		
	}
	
	@Test (priority = 20) 
	public void testSearch() {
		webTable.getWebTables().click();
		
		String search = excel.getStringData("WebTables", 14, 4);
		
		webTable.insertData(search);
		
	}
	
	@Test (priority = 30) 
	public void testEditAndDelete() throws InterruptedException {
		webTable.getWebTables().click();
		webTable.getEdit().click();
		
		String nameChanged = excel.getStringData("WebTables", 20, 4);
		webTable.insertFirstName(nameChanged);
		Thread.sleep(2000);
		
		webTable.getSubmit().click();
		Thread.sleep(2000);
		webTable.getDelete().click();	
		
	}
	
	
	@AfterMethod
	public void pageClose() {
		driver.manage().deleteAllCookies();
	}
	
}
