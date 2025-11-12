package ex_27_Exceptions;

public class Lab208_Arithmetic_Exception {
    public static void main(String[] args) {

        int c = 0;
        int b = 0;

        try {
            b = 10/c;
        } catch (Exception e) {
            System.out.println("Not Allowed");
        }
    }
}
