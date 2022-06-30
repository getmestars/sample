package runner_edu_pk;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features ={"classpath:features/education1.feature"}
,glue= {"Education_pk1"},
plugin = {"pretty", "html:target/cucumber-html-report/index.html"},
tags = {}
)


public class runner_educcccc {

}
