package OOPs_practice_1.abstraction;

public class abstract_class_example2 {
    public static void main(String[] args) {
        tata t1=new tata();
        t1.drive();
    }
}

abstract class engine{

    abstract void startEngine();
    abstract void stopEngine();
}

class tata extends engine{

    void startEngine(){
        System.out.println("start engine");
    }

    void stopEngine(){
        System.out.println("stop engine");
    }

    void drive(){
        startEngine();
        System.out.println("Driving");
        stopEngine();
    }
}
