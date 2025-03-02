package OOPs_practice;

public class car2_class {

    String model;
    long year;

    car2_class(){

        model="XXXX";
        year=0;
        System.out.println("DC"); //default constructor
    }

    car2_class(String model_name, long year_created){

        this.model=model_name;
        this.year=year_created;
        System.out.println("Parameterized Constructor"); //parameterized constructor
    }
    void display(){

        System.out.println(this.model + " - " + this.year);
    }
    String give_me_model_name(){
        return this.model;
    }
}
