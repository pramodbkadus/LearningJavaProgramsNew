package ex_30_Collection_Framework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab248_Map_within_ArrayList {
    public static void main(String[] args) {
        HashMap<String,String> student1 = new HashMap<>();
        student1.put("name","pramod");
        student1.put("roll","1");
        student1.put("phone","987654321");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap<>();
        student2.put("name","amit");
        student2.put("roll","2");
        student2.put("phone","123456789");
        System.out.println(student2);

        List listOFStudents = new ArrayList<>();
        listOFStudents.add(student1);
        listOFStudents.add(student2);
        System.out.println(listOFStudents);

    }
}
