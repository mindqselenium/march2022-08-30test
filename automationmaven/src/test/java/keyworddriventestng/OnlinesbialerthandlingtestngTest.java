package keyworddriventestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnlinesbialerthandlingtestngTest {

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
		driver.quit();
	}

	@Test(priority = 0)
	//personalbankinglogin method
	public void personalbankinglogin() throws Exception {
		//driver.findElement(By.xpath("//*[@id=\"banking\"]/div[1]/div/div[1]/a/span[1]")).click(); // personal banking login button 
		//driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();  // linktext implementation
		//driver.findElement(By.partialLinkText("CONTINUE TO")).click();  // partial linktext implementation
		//driver.findElement(By.xpath("//*[@id=\"banner\"]/div[2]/a")).click();  // relative xpath
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
