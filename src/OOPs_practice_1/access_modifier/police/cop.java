package OOPs_practice_1.access_modifier.police;

public class cop {

    public int gun;

    public cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot(){
        System.out.println("yes, you can shoot");
    }
}
