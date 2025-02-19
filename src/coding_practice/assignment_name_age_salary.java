package coding_practice;

public class assignment_name_age_salary {
    public static void main(String[] args) {
        //command line arguments inputs
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        double salary=Double.parseDouble(args[2]);

        System.out.println("User information");
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
