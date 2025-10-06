package ex_14_Strings;

public class LabStringExamples {
    public static void main(String[] args) {

        String s = "Java".substring(2);
        System.out.println(s);

        String s1 = "Java".substring(1,3);
        System.out.println(s1);

        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J','a','v','a']

        String st = " Java ".trim(); // trim empty spaces
        System.out.println(st);

        boolean b = "   ".isBlank();
        System.out.println(b);

        String s2 = "ab".repeat(3);
        System.out.println(s2);

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

        String s3 = "Java";
        char c = s3.charAt(2);
        System.out.println(c);

        int result = "abc".compareTo("ABC");   //32
        System.out.println(result);

        int idx = "Java".indexOf("a");  //1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); //3
        System.out.println(idx2);

        boolean b2 = "".isEmpty();  //true
        System.out.println(b2);

        String s11 = String.join("-","Java","Python");
        System.out.println(s11);

        String s12 = "Java".replace("a","o");   //Jovo
        System.out.println(s12);

        boolean b3 = "Java".startsWith("Ja");   //true
        System.out.println(b3);
    }
}
