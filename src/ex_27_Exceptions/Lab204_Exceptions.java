package ex_27_Exceptions;

public class Lab204_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start the program");

        String ip = args[0];    // when no argument given -> java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip);   // when argument is "pramod" -> java.lang.NumberFormatException
        int b = 100/a;      // When 0 is given in argument -> java.lang.ArithmeticException
        System.out.println(b);

        System.out.println("End the program");
    }
}
