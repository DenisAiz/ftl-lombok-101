package Example;

import Example.Task2.ValExample;
import Example.Task3.VarExample;
import Example.Task4.NonNullExample;
import Example.Task5.CleanUpExample;
import Example.Task6.GetterSetterExample;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        ValExample.run();
        VarExample.run();
        NonNullExample.run();

        GetterSetterExample getterSetterExample = new GetterSetterExample();
        System.out.println(getterSetterExample);

        CleanUpExample.run(args);
    }
}
