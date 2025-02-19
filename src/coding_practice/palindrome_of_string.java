package coding_practice;

import java.util.Scanner;

public class palindrome_of_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String name=sc.nextLine();
        name=name.toLowerCase();

        String reversed="";
        for (int i = name.length()-1; i >=0 ; i--) {
            reversed=reversed+name.charAt(i);
        }
        if(name.equals(reversed)) {
            System.out.println(name +" is a palindrome");
        }
        else {
            System.out.println(name +" is not a palindrome");
        }
        sc.close();
    }
}
