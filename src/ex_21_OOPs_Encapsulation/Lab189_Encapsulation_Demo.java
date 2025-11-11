package ex_21_OOPs_Encapsulation;

public class Lab189_Encapsulation_Demo {
    public static void main(String[] args) {

        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin","pwd123");
       // System.out.println(vwoLogin1.password);  // not able to access because on private access modifier
        String pass = vwoLogin1.getPassword();
        System.out.println(pass);
        vwoLogin1.setPassword("pk123",true);

    }

}

class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username, String password){
        this.password = password;
        this.username = username;
    }
}

class GoodVWOLogin{
    private String username;
    private String password;

    GoodVWOLogin(String username, String password){
        this.password = password;
        this.username = username;
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

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }else{
            System.out.println("Not Allowed!!");
        }
    }
}
