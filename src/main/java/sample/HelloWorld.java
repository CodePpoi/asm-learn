package sample;

import java.io.PrintStream;
import java.util.function.Consumer;

public class HelloWorld {

    public HelloWorld() {

    }

    public static void main(String[] args) {
        PrintStream var10000 = System.out;
        Consumer<String> c = var10000::println;;
        c.accept("Hello World");
    }
}
