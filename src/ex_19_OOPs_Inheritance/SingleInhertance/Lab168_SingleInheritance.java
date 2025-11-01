package ex_19_OOPs_Inheritance.SingleInhertance;

public class Lab168_SingleInheritance {
    public static void main(String[] args) {

        Son pramod = new Son();
        System.out.println(pramod.gold_f);
        pramod.bhk2();
        pramod.bhk3();

        Father father = new Father();
        System.out.println(father.gold_f);
        father.bhk2();
        // father.bhk3();
    }
}
