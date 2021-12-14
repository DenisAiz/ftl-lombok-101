package Example.Task6;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GetterSetterExample {
    @Setter@Getter private int age = 10;
    @Setter (AccessLevel.PROTECTED)private String name = "Erick";

    @Override
    public String toString(){
        return String.format("%s (age: %d)", name, age);
    }
}
