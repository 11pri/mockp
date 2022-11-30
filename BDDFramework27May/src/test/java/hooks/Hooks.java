package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before(order = 1)
	public void firstBeforeHook() {
		System.out.println("First before hook");
	}
	
	@Before(order = 2)
	public void secondBeforeHook() {
		System.out.println("Second before hook");
	}
	
	@After(order = 2)
	public void firstAfterHook() {
		System.out.println("First after hook");
	}
	
	@After(order = 1)
	public void secondAfterHook() {
		System.out.println("Second after hook");
	}
}
