package coding_practice;

import java.util.Scanner;

public class all_tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        for (int i = 1; i <=10; i++) {
            int result=num*i;
            System.out.println(num + "*" + i + "=" + result);
        }
        sc.close();
    }
}
