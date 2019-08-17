package utilities;

import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAndAfter {

	@Before
	public void setup() {
		System.out.println("RestAssured test started......");
	}

	@After
	public void tearDown() throws IOException {
		System.out.println("RestAssured test finished......");
	}

}
