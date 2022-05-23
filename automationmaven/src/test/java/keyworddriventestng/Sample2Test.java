package keyworddriventestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample2Test {
	
  @Test
  public void mango() {
	  System.out.println("this is mango method");
  }
  @Test
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
