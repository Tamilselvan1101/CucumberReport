package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberReport {
	public static void JVMreport(String json) {
		File file = new File("F:\\G Drive BackUp\\Photon\\Cucumber\\Cucumber report");
		Configuration configuration = new Configuration(file, "Adactin");
		configuration.addClassifications("Platform", "WIN-10");
		configuration.addClassifications("Browser", "Chrome");

		List<String> list = new ArrayList<String>();
		list.add(json);
		ReportBuilder builder = new ReportBuilder(list, configuration);
		builder.generateReports();

	}
}
