package Assignment_4th_Oct_2025;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {

        /*
            ✅ Grade Calculator:
            Write a program that calculates and displays the letter grade
            for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
            A: 90-100
            B: 80-89
            C: 70-79
            D: 60-69
            F: 0-59
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you marks: ");
        int marks = scanner.nextInt();

        if(marks >=90 && marks <=100){
            System.out.println("Your garde is: A");
        }else if (marks >=80 && marks <=89) {
            System.out.println("Your garde is: B");
        }else if (marks >=70 && marks <=79) {
            System.out.println("Your garde is: C");
        }else if (marks >=60 && marks <=69) {
            System.out.println("Your garde is: D");
        }else{
            System.out.println("Your garde is: F");
        }
    }
}
