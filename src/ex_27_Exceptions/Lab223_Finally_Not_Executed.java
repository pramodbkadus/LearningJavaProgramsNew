package ex_27_Exceptions;

public class Lab223_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            System.out.println("Try executed");
            System.exit(0);     // when we use this function finally will not executed.
        } catch (Exception e) {
            System.out.println("Catch executed");
        } finally {
            System.out.println("Finally executed");
        }

    }
}
