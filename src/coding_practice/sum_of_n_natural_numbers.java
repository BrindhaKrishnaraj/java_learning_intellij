package coding_practice;

import java.util.Scanner;

public class sum_of_n_natural_numbers {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=0;

        for (int i = num; i>0; i--) {
            sum=sum+i;
        }
        System.out.println("Sum of " + num + " natural number is " + sum);
    }
}
