Cucumber-jvm to continue next steps for assertion failures in a scenario: 

Usage:
Continuing the test execution for the next step even though there are assertion failures in a scenario
Note: Only Java Language is supported.

Continue Next Steps for Predefined or All Exceptions:
This fork uses the cucumber-jvm plugin to continue the test execution for some execptions in the scenario.

This can be used for the scenario where there is need for execution to be continued even though some of the assertions failed in a step

In the case where there are assertions in the @Then in the feature file.

To implement this feature the following depencies needs to be added.
Note: this feature is only supported for @Then Checks not for @When and @Given

<dependency>
  <groupId>com.github.slaout.fork.info.cukesthreads</groupId>
  <artifactId>cucumber-core</artifactId>
  <version>1.2.4</version>
</dependency>
<dependency>
  <groupId>com.github.slaout.fork.info.cukesthreads</groupId>
  <artifactId>cucumber-java</artifactId>
  <version>1.2.4</version>
</dependency>
<dependency>
  <groupId>com.github.slaout.fork.info.cukesthreads</groupId>
  <artifactId>cucumber-spring</artifactId>
  <version>1.2.4</version>
</dependency>
<dependency>
  <groupId>com.github.slaout.fork.info.cukesthreads</groupId>
  <artifactId>cucumber-junit</artifactId>
  <version>1.2.4</version>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>4.0.2.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-test</artifactId>
    <version>4.0.2.RELEASE</version>
</dependency>


Add the following to the step definition file where the test execution needs to be continued inspite of some exceptions:

"@ContinueNextStepsFor(AssertionError.class)"
@Then("^------------------$")





