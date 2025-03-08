package enum_practice;

public enum color {

    Red("#FF0000"),
    Green("#61FF33"),
    Blue("#3377FF"),
    Yellow("#4477FF");

    String hexcode;

    color(String hexcode) {
        this.hexcode = hexcode;
    }

    void getHexcode(){
        System.out.println(this.hexcode);
    }
}
