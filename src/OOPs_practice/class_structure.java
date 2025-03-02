package OOPs_practice;

public class class_structure {
    public static void main(String[] args) {

        dog d1=new dog();
        dog d2=new dog();

        d1.name="Neo";
        d2.name="Scooby";

        d1.walk();
        d2.bark();
    }
}

class dog{

    String name;
    String color;
    int age;

    void walk(){}
    void bark(){}
    void sleep(){}
}
