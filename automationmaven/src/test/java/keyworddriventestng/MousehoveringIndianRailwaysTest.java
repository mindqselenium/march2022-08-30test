package keyworddriventestng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MousehoveringIndianRailwaysTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.edge.driver", "F:\\830AM ONLINE\\SELENIUMSCENARIOS\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://indianrailways.gov.in/");
		Actions a=new Actions(driver); // actions is class from selenium interactions, useful to perform either keyboard and mouse actions.
	//	driver.findElement(By.partialLinkText("Zonal")).click();
	//	a.moveToElement(driver.findElement(By.partialLinkText("Zonal"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav\"]/li[4]/a"))).build().perform();
		driver.findElement(By.linkText("South Central Railway")).click();
		
			}
 

}
