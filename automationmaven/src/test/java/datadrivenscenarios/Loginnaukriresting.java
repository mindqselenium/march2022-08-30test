package datadrivenscenarios;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

//import jxl.Sheet;
//import jxl.Workbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginnaukriresting {
	public WebDriver driver;
  @Test
  public void f() throws Exception{
	FileInputStream fi=new FileInputStream("F:\\830AM ONLINE\\automationmaven\\testdata\\NAUKRI LOGIN TEST DATA.xlsx"); //Test Data path declaraton
	XSSFWorkbook workbook=new XSSFWorkbook(fi); //it will call fi location and open the workbook internally
	XSSFSheet sheet=workbook.getSheet("logindata");
		
		for (int i = 0; i<=sheet.getLastRowNum(); i++)
		{
		driver.findElement(By.xpath(".//*[@id='login_Layer']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/form/div[2]/input")).sendKeys((sheet.getRow(i).getCell(0).getStringCellValue()));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/form/div[3]/input")).sendKeys((sheet.getRow(i).getCell(1).getStringCellValue()));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/form/div[6]/button")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().to("https://www.naukri.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='login_Layer']")).click();
		//driver.findElement(By.name("email")).sendKeys((sheet.getRow(i).getCell(0).getStringCellValue()));
		}
		
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.naukri.com");
  }
  
}
