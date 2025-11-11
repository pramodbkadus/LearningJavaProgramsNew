package ex_20_OOPs_Polymorphism.methodOverRiding;

public class Lab190_MethodOverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        FirefoxTC f1 = new FirefoxTC();
        f1.openBrowser();

        CommonToAll common = new CommonToAll();
        common.openBrowser();

        // Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 = new FirefoxTC();
        c3.openBrowser();
    }

}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting the IE browser...");
    }
}

class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Chrome,, Better Browser!!");
    }
}

class FirefoxTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting FireFox,, Better Browser!!");
    }
}
