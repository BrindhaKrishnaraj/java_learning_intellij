package OOPs_practice_1.polymorphism.method_overriding;

public class main_function {
    public static void main(String[] args) {

        son s1=new son();
        s1.home();

        father f1=new father();
        f1.home();

        father f2=new son(); //Dynamic dispatch
        f2.home(); // method overriding - ridden the father method
    }
}
