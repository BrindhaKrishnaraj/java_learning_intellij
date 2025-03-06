package coding_practice;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=0;
        int temp;

       while(num>0){
            temp=num%10;
            sum=sum+temp;
            num=num/10;
       }
        System.out.println("Sum of the digits are " + sum);
    }
}
