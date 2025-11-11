package ex_23_OOPs_Super_Abstraction.SuperKeyword;

public class Lab180 {

}

class baseClass{

    baseClass(){
        System.out.println("Default constructor of Parent");
    }

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser(){
        System.out.println("Open Browser...");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser -> " + browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser...");
    }
}

class testCase extends baseClass{
    void TC1(){}

    testCase(){
        super();
        super.openBrowser();
        super.openBrowser("Chrome");
        super.closeBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("Firefox");
    }


}