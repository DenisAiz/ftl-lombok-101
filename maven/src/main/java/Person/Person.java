package Person;

import lombok.Getter;
import lombok.Setter;

public class Person {

    @Getter
    @Setter
    private String name;

    @Setter
    @Getter
    private String age;

}

