package exceptions_practice;

public class example_5_handle2 {
    public static void main(String[] args) {

        int a=0;
        int b=0;
        try {
             b=10/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println(b);
    }
}
