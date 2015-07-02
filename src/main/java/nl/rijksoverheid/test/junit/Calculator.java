package nl.rijksoverheid.test.junit;

/**
 * Extremely simple calculator written to try to write junit tests.
 *
 * @author Oscar Farg
 */
public class Calculator {

    public long add(long a, long b) {
        return a + b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public long divide(long a, long b) {
        return a / b;
    }

    public long square(long a) {
        return a * a;
    }

    public long sqrt(long a) {
        return (long) Math.sqrt(a);
    }

}
