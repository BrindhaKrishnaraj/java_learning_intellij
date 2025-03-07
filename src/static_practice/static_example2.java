package static_practice;

public class static_example2 {
}

class ATB1{
    {
        System.out.println("IIB - this is called when Object is created!");

    }
    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name; // non static
    private String phone;
    static String courseName = "ATB10x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non Static Method");
        System.out.println(courseName); // Non static method can access the static variables
    }

    static void doAssignment(){
        //System.out.println(phone); // Static method cannot access the non static variables because the object is not yet created
        System.out.println("Do Assignment");
    }



}