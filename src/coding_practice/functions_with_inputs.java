package coding_practice;

public class functions_with_inputs {
    public static void main(String[] args){


        int result_of_sum=sum(6,3);
        int result_of_sub=sub(6,3);
        int result_of_mul=mul(6,3);
        int result_of_div=div(6,3);
        int result_of_mod=mod(6,3);

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
