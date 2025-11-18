package ex_27_Exceptions;

import java.util.Scanner;

public class Lab222_Throw_Example {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int user_age = scanner.nextInt();
        validate_age_for_club(user_age);
    }

    static void validate_age_for_club(int age) throws Exception {
        if(age < 25){
            throw new Exception("Below 25 not allowed");
        }else{
            System.out.println("Allowed");
        }
    }
}
