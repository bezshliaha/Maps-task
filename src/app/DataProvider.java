package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataProvider {
    public String getId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        return sc.nextLine().trim();
    }

    public Map<Integer, Product> getData() {
        Map<Integer, Product> map = new HashMap<>();
        map.put(101, new Product("MacBook", "4", "1220"));
        map.put(102, new Product("iPhone", "1", "1000"));
        map.put(103, new Product("iWatch", "2", "500"));
        map.put(104, new Product("iPad", "3", "2000"));
        return map;

    }
}
