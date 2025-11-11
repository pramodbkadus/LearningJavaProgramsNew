package ex_20_OOPs_Polymorphism.methodOverRiding;

public class Lab189_Method_OverRiding {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Pramod p1 = new Pramod();
        p1.home();

        Father f1 = new Father();
        f1.home();

        // Dynamic Dispatch
        Father f2 = new Pramod();
        f2.home();
    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
}

class Pramod extends Father{
    @Override
    void home(){
        System.out.println("3BHK");
    }
}
