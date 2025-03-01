package coding_practice;

import java.util.Scanner;

public class function_without_inputs {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num 1");
        int a=0;
        if(sc.hasNextInt()){
             a=sc.nextInt();
        }
        else {
            System.out.println("Please enter int value");
            System.exit(0);
        }

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter num 2");
        int b=0;
        if(sc1.hasNextInt()){
            b=sc1.nextInt();
        }
        else {
            System.out.println("Please enter int value");
            System.exit(0);
        }

        int result_of_sum=sum(a,b);
        int result_of_sub=sub(a,b);
        int result_of_mul=mul(a,b);
        int result_of_div=div(a,b);
        int result_of_mod=mod(a,b);

        System.out.println(result_of_sum);
        System.out.println(result_of_sub);
        System.out.println(result_of_mul);
        System.out.println(result_of_div);
        System.out.println(result_of_mod);

    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
    static int mod(int a,int b){
        return a%b;
    }

}
