package keyworddriventestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitwaitProgram {

	static WebDriver driver;
	
	@BeforeTest
	public static void browserlaunchup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
	}

	@AfterTest
	public static void tearDown() throws Exception {
		
	}

	@Test(priority = 0)
	//personalbankinglogin method
	public void login() throws Exception {
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("username")).sendKeys("mindqselenium");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("label2")).sendKeys("mindq12345@#");
		
	}
}