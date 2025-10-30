package ex_17_OOPs;

public class Car2 {

    String model;
    int year;

    Car2(){
        model = "XXX";
        year = 1900;
        System.out.println("DC");
    }

    Car2(String model_name){
        this.model = model_name;
    }

    // constructor overloading
    Car2(String model_name, int year_created){
        this("i10");   // this is example of constructor chaining.
        this.model = model_name;
        this.year = year_created;
    }
}
