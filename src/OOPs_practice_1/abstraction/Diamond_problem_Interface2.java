package OOPs_practice_1.abstraction;

public class Diamond_problem_Interface2 {
    public static void main(String[] args) {

        Child c1=new Child();
        c1.money();
    }
}

class Child implements Father,Mother{

    public void money() {
        System.out.println("Child is spending money");//money should be given by father or mother but child is spending the money
    }

    @Override
    public void home() {

    }

    @Override
    public void farmhouse() {

    }
}

interface Father{
    void money();
    void home();
}

interface Mother{
    void money();
    void farmhouse();
}

