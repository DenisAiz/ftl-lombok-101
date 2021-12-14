package Example.Task4;

import lombok.NonNull;

public class NonNullExample extends Exception {
    private String name;

    public NonNullExample(@NonNull Person person) {
        super("Hello");
        this.name = person.getName();
    }

    public static void run(){
        Person person = new Person();
        NonNullExample param = new NonNullExample(person);

        if (param.name == null) {
            throw new NullPointerException("param is marked @NonNull but is null");
        }
        System.out.println(person.getName());
    }
}
