package keyworddriventestng;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FramesTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("F:\\830AM ONLINE\\automationmaven\\frames.html");
	//	driver.switchTo().frame("testng");
		//driver.switchTo().frame("u_0_2");
	//	driver.switchTo().frame(driver.findElement(By.name("testng")));
		driver.switchTo().frame(1);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.linkText("IDEA")).click();
		
		//System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		int totalframes=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(totalframes);
		driver.switchTo().defaultContent();
  }
 

}
