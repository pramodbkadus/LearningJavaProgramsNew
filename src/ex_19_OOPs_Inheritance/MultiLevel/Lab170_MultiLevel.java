package ex_19_OOPs_Inheritance.MultiLevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son pramod = new Son();
        pramod.home();
        pramod.bhk3();
        pramod.grandfather();
        pramod.extra();

        Father father = new Father();
        father.grandfather();
        father.home();

        GrandFather grandFather = new GrandFather();
        grandFather.grandfather();
        grandFather.home();

        // Dynamic Dispatch
        GrandFather g1 = new Son();
        Father f1 = new Son();
        // Son s1 = new GrandFather();
        // Son s2 = new Father();
    }
}
