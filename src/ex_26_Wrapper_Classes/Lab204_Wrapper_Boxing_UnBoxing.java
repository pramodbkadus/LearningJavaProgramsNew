package ex_26_Wrapper_Classes;

public class Lab204_Wrapper_Boxing_UnBoxing {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a;
        // Boxing -> Primitive to Wrapper -> AutoBoxing -> JVM will do it.
        System.out.println(b);
        System.out.println(a);

        //UnBoxing
        Integer aa = 43;
        int a1 = aa;
        System.out.println(a1);
    }
}
