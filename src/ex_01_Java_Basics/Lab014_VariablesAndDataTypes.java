package ex_01_Java_Basics;

public class Lab014_VariablesAndDataTypes {
    static void main(){

        // data_type variable_name = variable_value

        byte age =65; // max range -128 to 127
        char name = 'p'; // max range 65535
        short number1 = 1234; // max range -32768 to 32767
        int number2= 1234567890; // max range -2147483648 to 2147483647
        long number3 = 1234567890; // max range -2^63 to 2^63-1
        float decimalNumber1 = 1.1F; // max size byte=4 & bits=32
        double decimalNumber2 = 1.234D; // max size byte=8 & bits=64
        boolean answer = true; // true/false

        System.out.println(age);
        System.out.println(name);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(decimalNumber1);
        System.out.println(decimalNumber2);
        System.out.println(answer);
    }


}
