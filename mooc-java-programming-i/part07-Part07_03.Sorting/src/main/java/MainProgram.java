import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

    

        int[] numbers = {-1, 3, 1, 2};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        
        int[] moreNumbers = {8, 3, 7, 9, 1, 2, 4};

        sort(moreNumbers);
        System.out.println(Arrays.toString(moreNumbers));
    }

    public static int smallest(int [] array){
        int smallest = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int [] array){
        int index = 0;
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++){
            if (array[i] == smallest){
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int [] array, int startIndex){
        int smallest = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int [] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
