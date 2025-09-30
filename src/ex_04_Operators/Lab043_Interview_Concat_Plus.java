package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name = "Pramod";
        String last_name = "Kadus";

        int a = 10;
        int b = 10;

        System.out.println(first_name+last_name+a+b); // output >> PramodKadus1010
        System.out.println(a+b+first_name+last_name); // output >> 20PramodKadus

        System.out.println(first_name+last_name+(a+b)); // follow BODMAS >> output >> PramodKadus20
    }
}
