package coding_practice;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {

        boolean is_prime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if (num<=1){
            is_prime=false;
        }else {
            for (int i = 2; i <num ; i++) {
                if (num%i==0){
                    is_prime=false;
                    break;
                }
            }
        }

        if(is_prime){
            System.out.println("Given number is a prime number");
        }
        else {
            System.out.println("Given number is not a prime number");
        }
    }
}

