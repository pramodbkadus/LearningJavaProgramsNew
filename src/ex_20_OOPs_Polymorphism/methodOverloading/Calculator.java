package ex_20_OOPs_Polymorphism.methodOverloading;

public class Calculator {
    public static void main(String[] args) {
        calc c1 = new calc();
        c1.add(3,4);
    }
}

// Method OverLoading....
class calc{

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}