package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        int result = sum_of_two_number(3,4);
        int result2 = sum_of_two_number(10,45);
        System.out.println(result);
        System.out.println(result2);
    }

    static int sum_of_two_number(int a,int b){
        return a+b;
    }
}
