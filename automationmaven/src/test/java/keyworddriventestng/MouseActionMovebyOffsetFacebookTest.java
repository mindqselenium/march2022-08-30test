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

public class MouseActionMovebyOffsetFacebookTest {
	WebDriver driver;
  
@Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
	WebElement button=driver.findElement(By.linkText("Gmail"));

int xoffset=button.getRect().getX();
int yoffset=button.getRect().getY();
Actions a=new Actions(driver); // actions is class from selenium interactions, useful to perform either keyboard and mouse actions.
a.moveByOffset(xoffset, yoffset).build().perform();
button.click();
	
  }
 

}
