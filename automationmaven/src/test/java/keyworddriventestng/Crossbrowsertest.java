package keyworddriventestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Crossbrowsertest {

	WebDriver driver;
	@Test(enabled = false)
	public void chrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\830AM ONLINE\\SELENIUMSCENARIOS\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("The thread ID for chrome is "+ Thread.currentThread().getId());
		//driver.get("https://www.selenium.dev");  // to supply url
		driver.navigate().to("https://www.selenium.dev"); // to supply url
		Thread.sleep(3000);
		//driver.manage().window().minimize(); // to minimize the window
		//  driver.quit(); // to close complete browser 
	} 
	@Test
	public void firefox() {
		System.setProperty("webdriver.gecko.driver", "F:\\830AM ONLINE\\SELENIUMSCENARIOS\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		driver.get("https://www.selenium.dev");
	}
	@Test
	public void edge() {
		System.setProperty("webdriver.edge.driver", "F:\\830AM ONLINE\\SELENIUMSCENARIOS\\msedgedriver.exe");
		driver=new EdgeDriver();
		System.out.println("The thread ID for edge is "+ Thread.currentThread().getId());
		driver.get("https://www.selenium.dev");
		
	}
	
	
	}


