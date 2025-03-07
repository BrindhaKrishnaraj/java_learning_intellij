package OOPs_practice_1.abstraction;

public class abstract_class_example1 {
    public static void main(String[] args) {

        son s1=new son();
        s1.loan50k();
        s1.loan25k();
    }
}

abstract class father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("25k loan"); //abstract class can have incomplete or complete methods
    }
}

class son extends father{

    void loan50k(){
        System.out.println("50k loan");
    }
}
