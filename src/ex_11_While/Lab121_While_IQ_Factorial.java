package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for Factorial Program!");
        if(!scanner.hasNextInt()){
            System.out.println("Enter Only Integer");
        }
        else{
            int number = scanner.nextInt();

            int fact = 1;

            if(number == 0){
                System.out.println("Fact = 1");
            }

            if(number < 0 || number > Integer.MAX_VALUE){
                System.out.println("Cant get the factorial as out of bound!");
            }

            int i = 1;
            while (i <= number){
                fact = fact*i;
                i++;
            }
            System.out.println(fact);
        }

    }
}
