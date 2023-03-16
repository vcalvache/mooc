import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        String[] strs = {"aa", "cc", "ff", "bb", "dd", "ee"};
        System.out.println(Arrays.toString(strs));
        sort(strs);
        System.out.println(Arrays.toString(strs));
        ArrayList <Integer> integers = new ArrayList<>();
        integers.add(8);
        integers.add(3);
        integers.add(7);
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Horse");
        animals.add("Zebra");
        animals.add("Goat");
        animals.add("Animal");
        System.out.println(animals);
        Collections.sort(animals);
        System.out.println(animals);
    }

    public static void sort(int [] array){
        Arrays.sort(array);
    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
}