package keyworddriventestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GmailloginTest {
	WebDriver driver;
  @Test
  public void login() {
	  driver.findElement(By.id("identifierId")).clear();
	  driver.findElement(By.id("identifierId")).sendKeys("mindqselenium@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	  
		/*
		 * driver.findElement(By.name("password")).clear();
		 * driver.findElement(By.name("password")).sendKeys("mindqselenium");
		 * driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).
		 * click();
		 */
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "F:\\830AM ONLINE\\SELENIUMSCENARIOS\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.gmail.com");
	  driver.manage().window().maximize();
	 
	
  }

  @AfterTest
  public void afterTest() {
  }

}
