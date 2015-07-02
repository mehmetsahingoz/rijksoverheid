package nl.rijksoverheid.test.selenium.exercise1;

import nl.rijksoverheid.test.selenium.TestBase;

import static org.junit.Assert.assertTrue;

/**
 *
 * EXERCISE 1:
 * Search for 'Rijksoverheid' on www.google.nl.
 *
 * Step 1:
 * Examine the TestBase class. This will be the superclass for this Test.
 *
 * Step 2:
 * Add a test method with intellij Alt+Insert and click 'Test Method'.
 * We will be using JUnit 4 as our test framework.
 * Give it a clear and useful name like 'testGoogleSearchForRijksoverheid'
 * Notice that the method is annotated with @Test. This means that JUnit will run this method when the tests are run.
 *
 * Step 3:
 * Get a reference to the driver.
 *
 * Step 4:
 * use the WebDriver#get(String) method to browse to 'http://www.google.nl'
 *
 * Step 5:
 * Use the WebDriver#findElement(By) method to get the input field.
 * The By-object can be used to create an expression. We will be using xpath-expression.
 * Use By.xpath("//your/xpath/query") to create one. The xpath query can be found using google chrome.
 * Assign the result to WebElement searchInput.
 *
 * Step 6:
 * use the WebElement#sendKeys()-method to type 'Rijksoverheid' to the input.
 * use the WebElement#submit()-method to submit the searchfield.
 *
 * Step 7:
 * Get the xpath query for the first result in google chrome by searching for Rijksoverheid manually.
 *
 * Step 8:
 * Add a wait. Because this is out of scope just copy and past the following lines:
 *
 * WebDriverWait wait = new WebDriverWait(driver, 10);
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//the/xpath/query/from/the/previous/step/here")));
 *
 * This will create a new WebDriverWait object with a timeout of 10 seconds and then wait until the first search result is visible.
 *
 * Step 9:
 * We will now do the actual test to see if the first search result is Rijksoverheid.nl.
 * Get the first result element with the xpath from Step 7 using the same method as Step 5.
 *
 * Step 10:
 * Add a static import voor org.junit.Assert:
 * import static org.junit.Assert.*;
 *
 * Step 11:
 * Do the assertion. I checked if the text started with 'Rijksoverheid' by using WebElement#getText() on the search
 * result.
 *
 * Step 12:
 * Run the test by right clicking the method and click run.
 *
 * Step 13:
 * Celebrate your first selenium test.
 *
 * @author Oscar Farg
 */
public class MyFirstSeleniumTest extends TestBase {

}
