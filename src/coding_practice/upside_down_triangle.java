package coding_practice;

import java.util.Scanner;

public class upside_down_triangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for (int i = n; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

*****
****
***
**
*

 */