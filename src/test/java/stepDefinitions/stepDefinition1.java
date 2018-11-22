package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ContinueNextStepsFor;
import junit.framework.AssertionFailedError;
import methods.assertmethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stepDefinition1 {

    private static assertmethod asrtmd;
    
   
    
  
   
    @Given("^user is on landing page$")
    public void user_is_on_lading_page () throws Throwable {
    	 System.setProperty("webdriver.firefox.marionette", "C:\\Users\\tmedici\\Downloads\\geckodriver-v0.21.0-win32\\geckodriver.exe");
    	 WebDriver driver = new FirefoxDriver();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/a/strong")).click();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("wpName1")).sendKeys("triveni");
        driver.findElement(By.id("wpPassword1")).sendKeys("triveni");
        driver.findElement(By.id("wpLoginAttempt")).click();
        driver.findElement(By.id("wpLoginAttempt")).click();
        driver.quit();
    }

    @When("^user login into the application with username and password$")
    public void user_login_into_the_application_with_username_and_password() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("LOGGED INTO APPLICATION");
        

    }
    @ContinueNextStepsFor(AssertionError.class)
    @Then("^Home page is populated$")
    public void Home_page_is_populated() throws InterruptedException {
       // Thread.sleep(5000);
        Assert.fail("failed step");
       // System.out.println("Home page is populated");
    }


    @ContinueNextStepsFor(AssertionError.class)
    @Then("^cards are displayed$")
    public void cards_are_displayed() {
       // Assert.fail("failed step");
        
        System.out.println("cards are displayed");
   }
    @Then("^all The elements are enabled$")
    public void all_rhe_elements_are_enabled() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("ALL THE ELEMENTS ARE ENABLED");
        
    }
}
