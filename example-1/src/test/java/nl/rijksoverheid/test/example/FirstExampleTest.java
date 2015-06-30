package nl.rijksoverheid.test.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;


/**
 * Created by oscar on 29-6-15.
 */
public class FirstExampleTest {

    public static final String AMAZON = "Amazon";
    public static final String FIRST_RESULT = "//*[@id=\"rhs_block\"]/ol/li/div[1]/div/div[1]/ol/li[2]/div/div[1]";
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testFarg() throws Exception {

        driver.get("http://www.farg.nl");

        WebElement element = driver.findElement(By.xpath("/html/body/img"));
        assertEquals("img", element.getTagName());
    }
}
