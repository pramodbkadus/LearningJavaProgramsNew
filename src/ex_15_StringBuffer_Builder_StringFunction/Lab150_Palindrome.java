package ex_15_StringBuffer_Builder_StringFunction;

public class Lab150_Palindrome {
    public static void main(String[] args) {

        // madam -> reverse -> madam
        // userInput == reverse(userInput)

        String input = "madam";
        String reversed = "";

//        for (int i = input.length()-1 ; i >= 0 ; i--)
//        {
//            reversed = reversed + input.charAt(i);
//        }

        int i = input.length()-1;
        while(i >= 0){
            reversed = reversed + input.charAt(i);
            i--;
        }

        if(reversed.equalsIgnoreCase(input)){
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not palindrome");
        }
    }
}
