package OOPs_practice_1.abstraction;

public class Interface1_example {
    public static void main(String[] args) {

        Car c1=new Car();
        c1.drive();
    }
}

class Car implements Engine,Tyre{

     public void drive(){
        engine1();
        tyre1();
    }
    public void engine1(){
        System.out.println("start engine");
    }

    public void tyre1 (){
        System.out.println("stop car");
    }

}

interface Engine{
     void engine1(); // interface can have only incomplete methods
}

interface Tyre{
     void tyre1();
}
