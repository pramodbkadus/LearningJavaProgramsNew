package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter a,b (take the parameter from the user)

        // Logic Building

        // Step 1 -> Inputs and Outputs
        // a, b -> int -> scanner
        // int -> variable result

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner , "Enter the num1: ");
        int b = readInt(scanner , "Enter the num2: ");

        // Calling functions
        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);

        System.out.println("SUM: " + result_sum);
        System.out.println("SUB: " + result_sub);
        System.out.println("MUL: " + result_mul);
        System.out.println("DIV: " + result_div);

    }

    // Step 2 -> Rough logic -> create functions
    // Function -> type 4th -> with return type and parameters

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }


    // Step 3 -> handle edge cases

    static int readInt(Scanner scanner, String prompt){
        System.out.println(prompt);
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }else{
            System.out.println("Enter the valid integer");
            System.exit(0);
            return 0;
        }
    }
}
