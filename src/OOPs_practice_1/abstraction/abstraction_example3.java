package OOPs_practice_1.abstraction;

public class abstraction_example3 {
    public static void main(String[] args) {
        Book my_Book=new PrintMyBook("Harry Potter","J.K.Rowling",2000);
        my_Book.getDetails();

    }
}

abstract class Book{
    abstract void getDetails();
}

class PrintMyBook extends Book{

    String name;
    String author;
    int price;

    public PrintMyBook(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    void getDetails(){
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
}