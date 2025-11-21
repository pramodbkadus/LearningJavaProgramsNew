package ex_30_Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_SET_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        // Hashing mechanism to store the element with no order.
        // no duplicates

        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("WaterMelon");
        hashSet.add("WaterMelon");
//        hashSet.add(1234);
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println("-------------------------------------");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        // LinkedList mechanism to store the element with order maintain.
        // no duplicates

        linkedHashSet.add("Dpple");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("WaterMelon");
        linkedHashSet.add("WaterMelon");
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.contains("Apple"));
        System.out.println(linkedHashSet.size());

        System.out.println("-------------------------------------");

        Set treeSet = new TreeSet<>();
        // Black and Red Tree Mechanism to store the element.
        // Natural Sorting order is done.

        treeSet.add("Dpple");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("WaterMelon");
        treeSet.add("WaterMelon");

        System.out.println(treeSet);

    }
}
