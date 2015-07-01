package nl.rijksoverheid.test.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oscar on 1-7-15.
 */
public class HelloWorldTest {

    private HelloWorld helloWorld;

    @Before
    public void setUp() throws Exception {
        this.helloWorld = new HelloWorld();
    }

    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("Hello World", helloWorld.helloWorld());
    }
}