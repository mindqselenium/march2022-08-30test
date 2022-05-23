package keyworddriventestng;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class LufthansaAirlinesTktBookingTest {
	WebDriver driver;
	
  @SuppressWarnings("deprecation")
@Test
  public void tktbooking() {
	  driver.findElement(By.id("cm-acceptAll")).click();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.className("modal-close-button-text")).click();
	 
	  driver.findElement(By.name("flightQuery.flightSegments[0].originCode")).click();
	  Actions a=new Actions(driver);
	// WebElement from= driver.findElement(By.name("flightQuery.flightSegments[0].originCode"));
    	a.keyDown(Keys.CONTROL).sendKeys("A"+Keys.DELETE).build().perform();
    	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	
	// driver.findElement(By.name("flightQuery.flightSegments[0].originCode")).click();
	 driver.findElement(By.className("modal-close-button-text")).click();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.name("flightQuery.flightSegments[0].originCode")).sendKeys("Hyderabad");
	  
  }
  @BeforeTest
  public void browserlaunchup() {
		System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lufthansa.com/in/en/homepage");
	}

}
