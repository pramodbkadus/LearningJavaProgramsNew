package ex_16_Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {

        int[] numbers = {12,34,10,1,100,3,4,32}; //100,34

        //1st method
        //Arrays.sort(numbers);
        //System.out.println(numbers[numbers.length-2]);

        //2nd method

        int highest = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] > highest){
                highest = numbers[i];
            }
        }
        System.out.println("HIGHEST: " + highest);

        int secondHighest = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] > secondHighest && numbers[i] < highest){
                secondHighest = numbers[i];
            }
        }
        System.out.println("SECOND HIGHEST: " + secondHighest);

        // 3 method using Enhanced for loop

        int highest1 = numbers[0];

        for (int number : numbers) {
            if (number > highest1) {
                highest1 = number;
            }
        }
        System.out.println("HIGHEST: " + highest1);

        int secondHighest1 = numbers[0];

        for (int number : numbers) {
            if (number > secondHighest1 && number < highest1) {
                secondHighest1 = number;
            }
        }
        System.out.println("SECOND HIGHEST: " + secondHighest1);
    }
}
