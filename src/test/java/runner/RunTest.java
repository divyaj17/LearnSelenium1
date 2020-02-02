package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= {"src/test/java/feature/createLead.feature"} , glue="steps" ,monochrome=true)
public class RunTest extends AbstractTestNGCucumberTests
{

}
