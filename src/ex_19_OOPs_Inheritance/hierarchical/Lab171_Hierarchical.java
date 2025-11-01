package ex_19_OOPs_Inheritance.hierarchical;

public class Lab171_Hierarchical {
    public static void main(String[] args) {

        Pramod p1 = new Pramod();
        p1.fatherHome();
        p1.pramodHouse();

        Lucky l1 = new Lucky();
        l1.fatherHome();
        l1.luckHouse();

        Ruhani r1 = new Ruhani();
        r1.fatherHome();
        r1.ruhaniHouse();

        Father f1 = new Father();
        f1.fatherHome();
    }
}
