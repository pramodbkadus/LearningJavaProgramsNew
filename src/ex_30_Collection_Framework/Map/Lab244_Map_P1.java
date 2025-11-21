package ex_30_Collection_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_Map_P1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();

        m1.put("name","Pramod");
        m1.put("rollNo",123);
        m1.put("Phone",987654321);

        System.out.println(m1);

        System.out.println("------------------------------------");

        Map m2 = new LinkedHashMap();

        m2.put("name","Pramod");
        m2.put("rollNo",123);
        m2.put("Phone",987654321);

        System.out.println(m2);

        System.out.println("------------------------------------");

        Map m3 = new TreeMap();

        m3.put("name","Pramod");
        m3.put("rollNo",123);
        m3.put("phone",987654321);

        System.out.println(m3);


    }
}
