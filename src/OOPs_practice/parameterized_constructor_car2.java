package OOPs_practice;

import java.util.Scanner;

public class parameterized_constructor_car2 {
    public static void main(String[] args) {

        car2_class c1=new car2_class("Tesla",2025 );
        System.out.println(c1.model);
        System.out.println(c1.year);
        c1.display();
        String model_name_1=c1.give_me_model_name();
        System.out.println(model_name_1);

        System.out.println("------>");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nano car model");
        String model_name=sc.next();
        car2_class c2=new car2_class(model_name,2015); //year is hardcoded
        System.out.println(c2.model);
        System.out.println(c2.year);
        c2.display();

    }
}
