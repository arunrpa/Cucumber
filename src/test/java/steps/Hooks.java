package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods {
	@Before
	public void before(Scenario sc) {
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("Smoke");
		test.assignAuthor("Arun");
		startApp("chrome");
	}

	@After
	public void after(Scenario sc) {
		closeAllBrowsers();
		endResult();
	}

}
