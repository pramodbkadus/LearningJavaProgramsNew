package ex_30_Collection_Framework.Map;

import java.util.Hashtable;

public class Lab249_HashTable {
    public static void main(String[] args) {
        // Map -> key value pair -> null values not allowed
        // Hashtable -> Synchronized -> Slow and legacy class -> Threadsafe

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
//        ht1.put(4,null);  // throws exception -> java.lang.NullPointerException
//        ht1.put(null,"five"); // throws exception -> java.lang.NullPointerException

    }
}
