package enum_practice;

public enum Locators {

    pageButton("#bhk"),
    pageInput("#inp");

    String reference;

    Locators(String reference) {
        this.reference = reference;
    }

    void getReference(){
        System.out.println(this.reference);
    }
}
