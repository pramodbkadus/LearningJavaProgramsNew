package ex_20_OOPs_Polymorphism.methodOverloading;

public class Lab188_REAL_MethodOverloading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        h1.task("Bathroom Cleaning");
    }
}

class Home{

    void task(){
        System.out.println("Task Cleaning Fan");
    }

    void task(String whichTask){
        System.out.println("Task " + whichTask);
    }
}
