package coding_practice;

public class fizzbuzz_for_if {
    public static void main(String[] args) {
        for (int i = 0; i <=100; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else if (i%5==0 ) {
                System.out.println("buzz");
            }
            System.out.println(i);

        }
    }
}
