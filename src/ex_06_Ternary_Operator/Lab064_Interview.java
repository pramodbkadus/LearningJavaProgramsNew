package ex_06_Ternary_Operator;

public class Lab064_Interview {
    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int age = 21;
        String result = (age>18) ? (age>25 ? "You can Drive" : "You cannot Drive") : "No";
        System.out.println(result);
    }
}
