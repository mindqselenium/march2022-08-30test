package keyworddriventestng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Ohrmslogin_headlessTest {
	WebDriver driver;
	
	
	public void takescreenshot(String str) throws IOException {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(f, new File("F:\\830AM ONLINE\\automationmaven\\Screenshots\\"+str+".png"));
	
	}
	
  @Test
  public void f() throws IOException {
	  ChromeOptions options=new ChromeOptions(); // chromeoptions class initialization
	  options.addArguments("headless"); // mode of execution
	  options.addArguments("1024,768"); // browser resolution height and width
	  driver=new ChromeDriver(options); // chromebrowser launch up with options variable as headless.
	  driver.get("https://opensource-demo.orangehrmlive.com");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.name("Submit")).click();
	  System.out.println(driver.getCurrentUrl());
	  String str=driver.getTitle();
	  System.out.println(str);
	  takescreenshot("dashboard");
	  
  }
}
