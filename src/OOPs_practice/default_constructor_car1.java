package OOPs_practice;

public class default_constructor_car1 {
    public static void main(String[] args) {

        car1_class c1=new car1_class(); //when object is created constructor will be called
        car1_class c2=new car1_class();

        c1.name="Tesla";
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println("----->");

        c2.model="Nano";
        c2.year=2014;
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);

    }
}
