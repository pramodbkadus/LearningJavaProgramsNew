package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Reverse_Left_Triangle {
    public static void main(String[] args) {
        
        // Right hand triangle
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n number for pattern: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j >= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
