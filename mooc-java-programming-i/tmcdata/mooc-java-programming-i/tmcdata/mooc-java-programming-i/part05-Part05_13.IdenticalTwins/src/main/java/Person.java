
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects

    public boolean equals(Object comparedObject){

        if (this == comparedObject){
            return true;
        }

        if (!(comparedObject instanceof Person)){
            return false;
        }

        Person personToCompare = (Person) comparedObject;
        
        if (this.name.equals(personToCompare.name) && this.height == personToCompare.height 
            && this.weight == personToCompare.weight && this.birthday.equals(personToCompare.birthday)){
                return true;
            }

        return false;
    }
}
