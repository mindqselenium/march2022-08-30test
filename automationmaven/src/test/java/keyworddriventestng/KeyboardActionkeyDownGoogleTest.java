package keyworddriventestng;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class KeyboardActionkeyDownGoogleTest {
	WebDriver driver;
  @SuppressWarnings("deprecation")
@Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Actions a=new Actions(driver); // actions is class from selenium interactions, useful to perform either keyboard and mouse actions.
	driver.findElement(By.name("q")).sendKeys("indianrailways"+Keys.ENTER);
	a.keyDown(Keys.CONTROL).sendKeys("a").build().perform(); // it is keyboard activity, will press CTRL+A
	a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	//Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
  }
 

}
