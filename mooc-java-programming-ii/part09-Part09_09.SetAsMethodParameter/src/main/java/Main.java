import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("two");
        set.add("four");
        set.add("four");
        set.add("four");
        System.out.println(returnSize(set));

    }

    public static int returnSize(Set<String> set){
        return set.size();
    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.

}
