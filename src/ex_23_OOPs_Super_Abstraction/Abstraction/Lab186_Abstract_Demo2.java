package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab186_Abstract_Demo2 {
    public static void main(String[] args) {
        Alto a = new Alto();
        a.drive();


    }
}

abstract class Car1{

    abstract void startCar();
    abstract void stopCar();
}

interface Tyre{
    abstract void rubberTYre();
    void blackColorTyre();
}

interface Gear{
    void changeGear();
}
class Alto extends Car1 implements Tyre,Gear{

    void drive(){
        this.rubberTYre();
        this.blackColorTyre();
        this.startCar();
        this.changeGear();
        this.stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Starting the car");
    }

    @Override
    void stopCar() {
        System.out.println("Stoping the car");
    }

    @Override
    public void changeGear() {
        System.out.println("Change the Gear");
    }

    @Override
    public void rubberTYre() {
        System.out.println("Add Rubber Tyre to the Car");
    }

    @Override
    public void blackColorTyre() {
        System.out.println("Add Black color tyre to the Car");
    }
}
