package ex_25_ENUM;

public class Lab200_Congrats {
    public static void main(String[] args) {
        System.out.println(Environment.PROD.getBaseURL());
    }
}

enum Environment{
    DEV("https://dev.myapp.com"),
    STAGING("https://staging.myapp.com"),
    PROD("https://myapp.com");

    private final String baseURL;

    Environment(String baseURL){
        this.baseURL = baseURL;
    }

    public String getBaseURL(){
        return baseURL;
    }
}