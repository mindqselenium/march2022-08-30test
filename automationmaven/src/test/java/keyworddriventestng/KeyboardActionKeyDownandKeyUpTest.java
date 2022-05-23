package keyworddriventestng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class KeyboardActionKeyDownandKeyUpTest {
	
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Actions a=new Actions(driver); // actions is class from selenium interactions, useful to perform either keyboard and mouse actions.
	WebElement search=driver.findElement(By.name("q"));
	a.keyDown(Keys.SHIFT).sendKeys(search,"indianrailways").keyUp(Keys.SHIFT).sendKeys("indianrailways"+Keys.ENTER).build().perform();
	
	}
 

}
