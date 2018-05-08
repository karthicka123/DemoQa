package org.demoqa.test.DemoQaTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Feature", glue= {"org.demoqa.test.DemoQaTest"},
plugin= {"pretty", "html:G:\\DemoQaTest\\target"}, tags= {"@textbox,@regression,@sanity"})

public class TestRunnerClass {

	
}