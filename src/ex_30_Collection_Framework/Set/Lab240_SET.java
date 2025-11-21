package ex_30_Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab240_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("Kadus");
        System.out.println(hs);

        Set linkedHashSet = new LinkedHashSet();
        Set treeSet = new TreeSet();
    }
}
