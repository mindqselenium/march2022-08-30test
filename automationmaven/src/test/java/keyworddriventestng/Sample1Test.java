package keyworddriventestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample1Test {
  @Test
  public void f() {
	  System.out.println("this is f method");
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
