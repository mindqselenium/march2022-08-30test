package keyworddriventestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;

public class Sample4Test {
	
  @Test(priority = 1)
  public void mango() {
	  System.out.println("this is mango method");
  }
  
  //@Ignore
   @Test(priority = 0,enabled = true)
  public void apple() {
	  System.out.println("this is an apple method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is beforetest method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test method");
  }

}
