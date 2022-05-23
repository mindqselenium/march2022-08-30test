package keyworddriventestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class TestngGroupingTest {
	
  @Test(groups = "fruits")
  public void apple() {
	  System.out.println("it is an apple");
	  
  } @Test (groups ="fruits")
  public void grapes() {
	  System.out.println("it is an grapes");
  } 
  
  @Test (groups = "fruits")
  public void orange() {
	  System.out.println("it is an orange");
  } 
  @Test (groups = "fruits")
  public void berry() {
	  System.out.println("it is an berry");
  } 
  
  @Test(groups = "icecream")
  public void vanilla() {
	  System.out.println("it is an vanilla icecream");
  } 
 
}
