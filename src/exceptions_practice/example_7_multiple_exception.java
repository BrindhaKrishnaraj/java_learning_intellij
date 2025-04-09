package exceptions_practice;

public class example_7_multiple_exception {
    public static void main(String[] args) {

        int a = 0;
        int c = 0;
        try {
            c = 10/a;
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);

    }
}
