package com.stepdef;

import com.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenario() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/index.php");

	}

	@After
	public void afterScenario() {

		closeBrowser();

	}
}
