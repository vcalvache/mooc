
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(-1);
        list.add(4);
        list.add(-1);
        list.add(2);
        list.add(-1);
        list.add(6);

        System.out.println(positive(list));

    }

    public static List<Integer> positive(List<Integer> numbers){

        List<Integer> positiveNumbers = numbers.stream()
                                        .filter(num -> num > 0 )
                                        .collect(Collectors.toCollection(ArrayList<Integer>::new));
        
        return positiveNumbers;
    }

}