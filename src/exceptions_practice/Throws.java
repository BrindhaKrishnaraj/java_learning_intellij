package exceptions_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Throws {
    public static void main(String[] args) throws FileNotFoundException, Exception {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
