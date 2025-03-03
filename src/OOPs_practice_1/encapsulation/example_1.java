package OOPs_practice_1.encapsulation;

public class example_1 {
    public static void main(String[] args) {

        vwoLogin user1=new vwoLogin("brindha" ,123);
        System.out.println(user1.username);
        System.out.println(user1.password);
        user1.password=456; //password is able to change because the instance variables are declared as public in vwoLogin class
        System.out.println(user1.password);

        System.out.println("----->");

        EncapvwoLogin user2=new EncapvwoLogin("shalini", "786"); //since the instance variables are private and no if condition, i can get username/password & set username
        System.out.println(user2.getUsername());
        user2.setUsername("lalitha");
        System.out.println(user2.getUsername());
        System.out.println(user2.getPassword());

        boolean admin=true; // if condition is set for setusername
        user2.setPassword("028", false);
        System.out.println(user2.getPassword());


    }

}


class vwoLogin{

    public String username;
    public int password;

    public vwoLogin(String username, int password) {
        this.username = username;
        this.password = password;
    }
}

class EncapvwoLogin{

    private String username;
    private String password;

    public EncapvwoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean admin) {
        if(admin){
            this.password = password;
        } else {
            System.out.println("not allowed to change password");
        }


    }
}