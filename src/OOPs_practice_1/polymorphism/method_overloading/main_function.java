package OOPs_practice_1.polymorphism.method_overloading;

public class main_function {
    public static void main(String[] args) {

        math_operation m1=new math_operation();
        int r=m1.add(2,4);
        System.out.println(r);

        int r1=m1.add(6,2,6);
        System.out.println(r1);

        double r2=m1.add(4.5,2.4);
        System.out.println(r2);
    }
}
