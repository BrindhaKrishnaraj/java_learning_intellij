package OOPs_practice_1.super_keyword;

public class super_keyword_use {
    public static void main(String[] args) {
        car c1=new car(100);
        c1.display();
    }
}

class vehicle{

    public int maxSpeed=180;

    vehicle(){
        System.out.println("DC");
    }

    vehicle(int a){
        System.out.println("PC");
    }

    void display(){
        System.out.println("function");
    }
}

class car extends vehicle{

    public int maxSpeed=240;

    car(){
        super(100);
    }

    car(int a){
        System.out.println("car PC");
    }

    void display(){
        System.out.println("car override");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
    }
}
