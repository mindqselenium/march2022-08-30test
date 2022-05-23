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

public class MouseActionDragandDropTest {
	WebDriver driver;
  
@Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\automationmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
	      // Store 'box B' as source element
	      WebElement targetElement = driver.findElement(By.id("droppable"));
	      Actions a = new Actions(driver);
	      // Performs drag and drop action of sourceEle onto the targetEle
	     a.dragAndDrop(sourceElement, targetElement).build().perform();
	     
	
  }
 

}
