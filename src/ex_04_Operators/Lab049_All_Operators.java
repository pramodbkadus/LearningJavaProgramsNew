package ex_04_Operators;

public class Lab049_All_Operators {
    public static void main(String[] args) {

        //Assignment operators
        boolean b1 = true;
        int a = 10;
        int b = 20;

        //Arithmetic operators
        System.out.println(a + b); // also -,%,*,/
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        //Compound operator
        int age = 10;
        age += 10; // age = age + 10 >> 20
        System.out.println(age);

    }
}
