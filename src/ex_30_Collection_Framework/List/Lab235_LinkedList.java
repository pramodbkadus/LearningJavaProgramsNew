package ex_30_Collection_Framework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab235_LinkedList {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>(10);
        List list3 = List.of("12","23");

        List mylist = new LinkedList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4);
        System.out.println(mylist);
    }
}
