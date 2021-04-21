package RunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\Amazon.feature",glue="StepPage",dryRun=false)

public class RunnerClass {



}
