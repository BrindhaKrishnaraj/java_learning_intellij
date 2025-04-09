package Generics;

public class example2 {
    public static void main(String[] args) {
        temp(23,45);
        temp("Pramod","Dutta");
        temp("Pramod",123);
        temp(true,false);
    }

    public static <T> T temp(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
