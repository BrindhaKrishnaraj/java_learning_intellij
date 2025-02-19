package coding_practice;

import java.util.Scanner;

public class reverse_a_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.nextLine();

        String reversed = "";
        for (int i = name.length()-1; i >=0; i--) {
            reversed=reversed+name.charAt(i);
        }
        System.out.println(name);
        System.out.println(reversed);
        sc.close();
    }
}
