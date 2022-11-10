package stepDefination;

import basePKG.MainClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends MainClass {

	
	@Before
	public void openApp() {
		initilization();
	}
	
	@After
	public void closeApp() {
		tearDown();
	}
}
