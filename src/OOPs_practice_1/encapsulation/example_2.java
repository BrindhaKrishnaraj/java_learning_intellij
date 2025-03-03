package OOPs_practice_1.encapsulation;

public class example_2 {
    public static void main(String[] args) {

        ICICI user1=new ICICI("brindha",1000);
        System.out.println(user1.getName());
        user1.setName("shalini");
        System.out.println(user1.getName());
        System.out.println(user1.getBal());

        System.out.println("---->");

        boolean customer=true;
        user1.setBal(2000, false);
        System.out.println(user1.getBal());
    }
}

class ICICI{

    private String name;
    private long bal;

    public ICICI(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean customer) {
        if (customer){
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change balance");
        }
    }
}
