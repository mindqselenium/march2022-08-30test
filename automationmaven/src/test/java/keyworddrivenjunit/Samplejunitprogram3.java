package keyworddrivenjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Samplejunitprogram3 {

	@BeforeClass
	public static void apple() throws Exception {
		System.out.println("this is apple");
	}

	@AfterClass
	public static void grapes() throws Exception {
		System.out.println("this is grapes");
	}

	@Test
	public void fruit1() {
		System.out.println("this is fruit1 method");
	}

	@Test 
	public void fruit2() {
		System.out.println("this is fruit2 method");
	}
}
