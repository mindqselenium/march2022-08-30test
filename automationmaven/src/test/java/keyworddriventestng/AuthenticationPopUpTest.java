package keyworddriventestng;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AuthenticationPopUpTest {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();	
			
		
     //Launching the site.				
         driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        // String str=driver.findElement(By.cssSelector("p")).getText();
        
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			String title = driver.getTitle();
			
			System.out.println("The page title is "+title);
			
			String text = driver.findElement(By.tagName("p")).getText();
			
			System.out.println("The test present in page is ==> "+text);
			
			//driver.close();
			//driver.quit();
  }
 

}
