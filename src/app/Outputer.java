package app;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Outputer {

    public void getOutput(Map<Integer, Product> map) {
        System.out.println("\nALL PRODUCTS:");
        AtomicInteger count = new AtomicInteger(0);
        map.forEach(
                (key, value) ->
                        System.out.println(count.incrementAndGet() +
                                ") id " + key + ", " + value));
    }

    public void getOutput(String output) {
        System.out.println("\n>> " + output);
    }
}

