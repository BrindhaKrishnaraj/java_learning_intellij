package coding_practice;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int f=1,s=1,t;
        System.out.print(f + " ");
        System.out.print(s + " ");
        for (int i = 3; i <=num ; i++) {
            t=f+s;
            System.out.print(t + " ");
            f=s;
            s=t;
        }
    }
}
