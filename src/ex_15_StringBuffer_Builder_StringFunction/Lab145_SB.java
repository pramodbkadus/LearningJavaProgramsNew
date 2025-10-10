package ex_15_StringBuffer_Builder_StringFunction;

public class Lab145_SB {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Kadus");
        System.out.println(stringBuffer);

        String s1 = "PRamod";
        s1 = s1 + "Kadus";
        System.out.println(s1);
    }
}
