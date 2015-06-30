package nl.rijksoverheid.test.exercise1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This is the Superclass to all Tests in this project. See the documentation on each method to find out what is does.
 * Created by oscar on 30-6-15.
 */
public class TestBase {

    //Selenium web driver.
    private static WebDriver driver;

    // This method is automatically run when the class is initialized.
    @BeforeClass
    public static void before() throws Exception {
        //Create a new driver, the driver for Firefox.
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        //Set the driver to firefox so it can be used in subclasses.
        setDriver(firefoxDriver);
    }

    //This method is automatically run when this class is destroyed.
    @AfterClass
    public static void after() throws Exception {
        //Quit the driver, with the Firefox driver we're using the result will be that Firefox is exited.
        driver.quit();
    }

    // Method that has to be used by subclasses to get a reference of the driver.
    public static WebDriver getDriver() {
        return driver;
    }

    // Set the driver.
    private static void setDriver(WebDriver driver) {
        TestBase.driver = driver;
    }
}
