package keyworddriventestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicitwait_sbiexample {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();		
     //Launching the site.				
         driver.get("https://www.onlinesbi.com");			
     driver.manage().window().maximize();	
   //  WebDriverWait wait=new WebDriverWait(driver, 20);
    // WebDriverWait wait=new WebDriverWait(driver,50);
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='classicTxt']")));
          driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
  }
}
