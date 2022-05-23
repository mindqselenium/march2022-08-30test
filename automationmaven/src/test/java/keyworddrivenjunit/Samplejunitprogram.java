package keyworddrivenjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Samplejunitprogram {

	@Before
	public void browserlaunch() throws Exception {
		System.out.println("this is browser launchup method");
	}

	@After
	public void browserclose() throws Exception {
		System.out.println("this is browser closing method");
	}

	@Test
	public void logintest() {
		System.out.println("this is logintest case method");
	}

}
