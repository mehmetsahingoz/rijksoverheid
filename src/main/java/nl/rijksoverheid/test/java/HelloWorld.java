package nl.rijksoverheid.test.java;

/**
 * @author Oscar Farg
 */
public class HelloWorld {

    public String helloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().helloWorld());
    }
}
