package nl.rijksoverheid.test.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Calculator test example.
 * Created by oscar on 30-6-15.
 */
public class CalculatorTest {

    private Calculator calculator;

    //Run before each test to create a new calculator.
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    //Test the add method.
    @Test
    public void testAdd() throws Exception {
        // add 1 to 1, result should be 2.
        long result = calculator.add(1, 1);

        //Assert that result is 2
        assertEquals(2, result);
    }

    //Test the subtract method
    @Test
    public void testSubtract() throws Exception {
        //Subtract 5 from 10, result should be 5.
        long result = calculator.subtract(10, 5);

        //Assert that result is 5
        assertEquals(5, result);
    }

    //test the multiply method
    @Test
    public void testMultiply() throws Exception {
        //Multiply 5 by 5, result should be 25.
        long result = calculator.multiply(5, 5);

        //Assert that result is 25.
        assertEquals(25, result);
    }

    //test the divide method,
    @Test
    public void testDivide() throws Exception {
        //divide 25 by 5. Result should be 5
        long result = calculator.divide(25, 5);

        //assert that result is 5
        assertEquals(5, result);
    }

    //Fail a test on purpose
    @Test
    public void testFailed() throws Exception {
        //multiply 100 by 5. Result is 500
        long result = calculator.multiply(100, 5);

        //fail the assertion
        assertEquals(105, result);

    }
}
