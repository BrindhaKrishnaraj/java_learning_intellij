package Wrapper_class;

public class Wrapper {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; // Boxing - int -> Interger  - JVM -> AutoBoxing
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());

        Integer a2 = 42;
        int v = a2; // Unboxing -
        System.out.println(v);
    }
}
