package coding_practice;

import java.util.Scanner;

public class array_input_from_user {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int[] array=new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number " + (i+1));
            array[i]=sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
