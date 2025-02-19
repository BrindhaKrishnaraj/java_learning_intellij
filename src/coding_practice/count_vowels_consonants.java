package coding_practice;

import java.util.Scanner;

public class count_vowels_consonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.next();

        int vcount=0;
        int ccount=0;
        name=name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char ch=name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount=vcount+1;
            } else if(ch>='a' && ch<='z') {
                ccount=ccount+1;
            }

        }
        System.out.println(name);
        System.out.println("vcount="+vcount);
        System.out.println("ccount="+ccount);
        sc.close();
    }
}
