package ex_30_Collection_Framework.List;

import java.util.*;

public class Lab237_ArrayList_Iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        System.out.println("-- To Print ArrayList -- For Each --");
        for (String str : mylist){
            System.out.println(str);
        }

        System.out.println("-- To Print ArrayList -- Iterator --");
        Iterator<String> iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-- To Print ArrayList -- For loop --");

        for (int i = 0; i < mylist.size() ; i++) {
            System.out.println(mylist.get(i));
        }
    }
}
