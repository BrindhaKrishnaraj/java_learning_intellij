package exceptions_practice;

public class example_4_handle1 {
    public static void main(String[] args) {

        System.out.println("Start!");
        String s1 = null;
        try {
            s1.trim(); //checked exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
