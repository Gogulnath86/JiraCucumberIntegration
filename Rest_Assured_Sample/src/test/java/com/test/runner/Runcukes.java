package com.test.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Feature/",
	    tags = {"@ClientDemo"},
		glue = {"com.test.stepdef"},
		dryRun = false,
		plugin = {"pretty","html:target/Destination","com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/report.html"}		)
public class Runcukes {
	
}
