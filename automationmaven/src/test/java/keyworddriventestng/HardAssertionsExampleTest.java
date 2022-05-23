package keyworddriventestng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionsExampleTest {

	static WebDriver driver;
	
	@BeforeTest
	public static void browserlaunchup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "State Bank of India";
		//hardAssert Implementation
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		
		//String verifyAssertNull=null;
		//Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("State Bank of India - Personal Banking");
		//Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Personal");
		//assertNotEquals(ExpectedTitle, "sbi");
		//assertTrue(verifyTitleIsPresent);
		//assertFalse(verifyTitleIsChanged);
		//assertNotNull(verifyTitleIsPresent);
	//	assertNull(verifyAssertNull);
		
		}

	@AfterTest
	public static void tearDown() throws Exception {
		
	}

	@Test(priority = 0)
	//personalbankinglogin method
	public void personalbankinglogin() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/a")).click(); // continue to login button 
	}
	
	@Test(priority = 1)
	//alerts method
	public void alertsmethod() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		
		   // System.out.println(driver.switchTo().alert().getText());	// to get the message from the alert
			String str=driver.switchTo().alert().getText();  //  to get the message from the alert and assigned to str variable. 
			System.out.println(str);  // to print str variable information. 
			//driver.switchTo().alert().dismiss(); // to switch into alert and click on cancel button.
			driver.switchTo().alert().accept(); // to switch into alert and click on ok button.
	}

}
