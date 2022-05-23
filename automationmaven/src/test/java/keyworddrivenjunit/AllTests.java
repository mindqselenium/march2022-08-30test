package keyworddrivenjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class) //@RunWith purpose is to specify the type of execution and also type of file extension 
                      //@SuiteClasses purpose to specify the classnames with .class extensions
@SuiteClasses(
		{   Onlinesbialerthandlingjunit.class,
			Samplejunitprogram.class, 
			Samplejunitprogram2.class,
		    Samplejunitprogram3.class 
		})

public class AllTests {

}
