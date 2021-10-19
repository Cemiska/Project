package projekat_baza;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import projekat_baza.Excel;
import projekat_pages.Buttons;
import projekat_pages.DynamicProperties;
import projekat_pages.Elements_TextBox;
import projekat_pages.Forms;
import projekat_pages.MainPage;
import projekat_pages.RadioButton;
import projekat_pages.UploadAndDownload;
import projekat_pages.WebTables;

public class Base {

	public WebDriver driver;
	public Excel excel;
	public MainPage mainPage;
	public Elements_TextBox elements;
	public RadioButton radioButton;
	public WebTables webTable;
	public Buttons buttons;
	public DynamicProperties dynamicProp;
	public UploadAndDownload uploadDownload;
	public Forms forms;
	
	@BeforeClass
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		excel = new Excel("C:\\Users\\Slavisa\\Desktop\\QA\\Projekat\\Projekat.xlsx");
		mainPage = new MainPage(driver);
		elements = new Elements_TextBox(driver);
		radioButton = new RadioButton(driver);
		webTable = new WebTables(driver);
		buttons = new Buttons(driver);
		dynamicProp = new DynamicProperties(driver);
		uploadDownload = new UploadAndDownload(driver);
		forms = new Forms(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
