package coding_practice;

public class type_casting_narrowing {
    public static void main(String[] args) {
        int val  = 200;
//        byte b = val; // // Invalid - Implicit Casting narrowing is not allowed
        byte b = (byte)val; // // // Valid -> Explicit Casting -  allowed
    }
}
