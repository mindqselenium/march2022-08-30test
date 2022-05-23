package datadrivenscenarios;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test(dataProvider = "SELENIUM123")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] SELENIUM123() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
  }

}
