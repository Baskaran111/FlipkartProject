package runnerClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {

		System.out.println("======browser initialized by before hooks");
	}

	@After
	public void tearDown() {

		System.out.println("======close the browser");
	}

}
