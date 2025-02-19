package coding_practice;

import java.util.Scanner;

public class switch_browser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser=sc.next();
        switch (browser){
            case "chrome":
                System.out.println("chrome browser");
                break;
            case "firefox":
                System.out.println("firefox browser");
                break;
            case "edge":
                System.out.println("edge browser");
                break;
            default:
                System.out.println("not in list");
        }
        sc.close();
    }
}
