package Example;

import Example.Task2.ValExample;
import Example.Task3.VarExample;
import Example.Task4.NonNullExample;
import Example.Task6.GetterSetterExample;
import Example.Task7.ToStringExample;

import java.awt.*;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        ValExample.run();
        VarExample.run();
        NonNullExample.run();

        System.out.println(new ToStringExample.Square(11, 22));
        System.out.println(new ToStringExample());

        GetterSetterExample getterSetterExample = new GetterSetterExample();
        System.out.println(getterSetterExample);

        //CleanUpExample.run(args);
    }
}
