package coding_practice;

import java.util.Arrays;

public class second_largest_number_in_array {
    public static void main(String[] args) {
        int[] array={23,76,28,79,35,78};
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Second largest number is " + array[array.length-2]);


    }
}
