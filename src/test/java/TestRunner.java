/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports",
        		"json:target/cucumber.json", 
        		"rerun:target/rerun.txt"},
        features = {"src/test/resources/features"},
      //  tags = {"~@ignored"},
        glue = { "stepDefinitions" }
        
)
public class TestRunner {
}
*/

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        monochrome = true,
		tags = {"@Work"},
		glue = {"stepDefinitions"},
        plugin =    {
        		"html:target/cucumber-html-report",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json",
                "junit:target/cucumber-results.xml"}
        )

public class TestRunner  {

	

}
