package coding_practice;

import java.util.Scanner;

public class find_number_of_digits {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int count=0;

        while (num>0){
            num=num/10;
            count+=1;
        }
        System.out.println("Number of digits is " + count);
    }
}
