package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.CucumberReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = { "com.stepdef" }, monochrome = true, plugin = { "pretty",
		"html:F:\\G Drive BackUp\\Photon\\Cucumber\\Report",
		"json:F:\\G Drive BackUp\\Photon\\Cucumber\\Report\\adactin.json",
		"junit:F:\\G Drive BackUp\\Photon\\Cucumber\\Report\\adactin.xml",
		"json:F:\\G Drive BackUp\\Photon\\Cucumber\\Cucumber report\\adactin.json" })
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		CucumberReport.JVMreport("F:\\G Drive BackUp\\Photon\\Cucumber\\Cucumber report\\adactin.json");

	}
}
