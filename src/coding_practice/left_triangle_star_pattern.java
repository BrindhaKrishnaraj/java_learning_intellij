package coding_practice;

import java.util.Scanner;

public class left_triangle_star_pattern{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for (int i =0; i < n; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

    *
   **
  ***
 ****
*****

 */

