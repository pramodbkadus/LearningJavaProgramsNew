package ex_01_Java_Basics;

public class Lab034_Char_Literal {
    static void main(){

        /* char has ASCII code and UNICODE for example char 'A' has ASCII=65 and UNICODE= \o0041*/

        char c1= 'A'; // A to A, a-z, !@#$%^&*()_+

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodKadus");
        System.out.println("Pramod"+new_line+"Kadus");
        System.out.println("Pramod\nKadus");
        System.out.println("Pramod"+tab_line+"Kadus");
        System.out.println("Pramod"+back_space+"Kadus");

    }
}
