package ex_15_StringBuffer_Builder_StringFunction;

import java.util.Scanner;

public class Lab149_Program_ChatAt_Reverse_String {
    public static void main(String[] args) {

        // Write a program to reverse a string without using inbuilt functions.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string..");
        String user_input = scanner.next();

//        StringBuilder sb = new StringBuilder(user_input);
//        System.out.println(sb.reverse());

        // Pramod -> user_input.length(), chatAt()
        String reverse_user_input = "";

        for (int i = user_input.length()-1; i >= 0 ; i--) {
            reverse_user_input = reverse_user_input + user_input.charAt(i);
        }
        System.out.println(reverse_user_input);
    }
}
