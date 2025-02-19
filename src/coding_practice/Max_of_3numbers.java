package coding_practice;

public class Max_of_3numbers {
    public static void main(String[] args) {
        int a=10, b=20, c=4;
        int result = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(result);
    }

}
