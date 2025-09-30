package ex_06_Ternary_Operator;

public class Lab062_Ternary_Operator {
    public static void main(String[] args) {

        // result = condition ? expression1 : expression2;

        int age = 19;
        String canVote = age > 18 ? "Yes" : "No";
        System.out.println(canVote);
    }
}
