package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	@Before
	public void setup() {
		System.out.println("Hooks : @before");
	}
	@Before(order=1)
	public void setup1() {
		System.out.println("Hooks : @before with Order 1");
	}
	@Before(order=2)
	public void setup2() {
		System.out.println("Hooks : @before with order 2");
	}
	@Before("@Smoke")
	public void setup3() {
		System.out.println("Hooks : @before with Conditional hook");
	}
	
	@After
	public void teardown() {
		System.out.println("Hooks : @After");
	}
	
	@After(order=1)
	public void teardown1() {
		System.out.println("Hooks : @After with order 1");
	}
	@After(order=2)
	public void teardown2() {
		System.out.println("Hooks : @After with order 2");
	}
	
	
	@After("@Smoke")
	public void teardown3() {
		System.out.println("Hooks : @After with conditonal hook");
	}
	
	@BeforeStep
	public void Logging() {
		System.out.println("Hooks : @BeforeStep");
	}
	
	@AfterStep
	public void Screenshot() {
		System.out.println("Hooks : @AfterStep");
	}
	
	@BeforeAll
	public static void DBConnection() {
		System.out.println(" Hooks : @BeforeAll");
		
	}

	
	@AfterAll
	public static void CloseDBConnection() {
		System.out.println("Hooks : @AfterAll");
	}
}
