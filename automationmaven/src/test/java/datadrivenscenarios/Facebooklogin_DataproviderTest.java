package datadrivenscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Facebooklogin_DataproviderTest {

	 WebDriver driver;

  @BeforeTest
  public void browser(){
	  System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("http://www.fb.com");
  }

  // Here we are calling the Data Provider object with its Name

  @Test(dataProvider = "Authentication")

  public void test(String sUsername, String sPassword) {

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.findElement(By.id("email")).clear();
      
      driver.findElement(By.id("email")).sendKeys(sUsername);
      
      driver.findElement(By.id("pass")).clear();
      
      driver.findElement(By.id("pass")).sendKeys(sPassword);
     // driver.findElement(By.xpath("//input[@value='Log In' or type='submit']")).click();

    //  driver.quit();
      
  }
  @DataProvider(name = "Authentication")

  public  Object[][] credentials() 
        {

        return new Object[][] { 
        	{ "mindq@gmail.com",    "Test@123" }, 
        	{ "selenium@gmail.com", "Test@123" },
        	{ "ameerpet@gmail.com",  "test@345"},
        	{ "manual@gmail.com", "test@123"}
        	};

          }
}