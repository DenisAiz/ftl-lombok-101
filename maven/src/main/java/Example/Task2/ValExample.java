package Example.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.val;

public class ValExample {
    public String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public HashMap<Integer, String> example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        return map;
    }

    public static void run(){
        ValExample valExample = new ValExample();
        System.out.println(valExample.example());
        System.out.println(valExample.example2());
    }
}

