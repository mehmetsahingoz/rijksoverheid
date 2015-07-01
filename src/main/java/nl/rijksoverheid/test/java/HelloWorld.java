package nl.rijksoverheid.test.java;

/**
 * Created by oscar on 1-7-15.
 */
public class HelloWorld {

    public String helloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().helloWorld());
    }
}
