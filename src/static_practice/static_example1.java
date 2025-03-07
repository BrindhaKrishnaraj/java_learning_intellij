package static_practice;

public class static_example1 {
    public static void main(String[] args) {

        ATB s1=new ATB(96935,"Brindha");
        System.out.println(s1.phone_num);
        System.out.println(s1.name);

        System.out.println(ATB.courseName);
        ATB.display();

        ATB s2=new ATB(93626,"Balaji");
        System.out.println(s2.phone_num);
        System.out.println(s2.name);
    }
}

class ATB{

    static String courseName="ATB10x"; //static instance variable can be accessed without the object creation
    long phone_num;
    String name;

    static {
        System.out.println("Details about students"); //once class is loaded static block will be executed only once
    }

    public ATB(long phone_num1, String name1) {
        this.phone_num = phone_num1;
        this.name = name1;
        }
    static void display(){
        System.out.println("Brindha and Balaji"); //static methods can be accessed without the object creation
    }
}
