package Example.Task3;

import java.util.Random;

public class VarExample {
    public String example() {
        var foo = "Случайное число:";
        Random rundom = new Random();
        foo = foo + rundom.nextInt();
        return foo;
    }

    public static void run() {
        VarExample varExample = new VarExample();
        System.out.println(varExample.example());
    }
}
