package TreeSet;

import java.util.TreeSet;

/**
 * problem statement:
 * write program for treeSet in java
 */
public class treeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeset = new TreeSet<String>();
        treeset.add("Apple");
        treeset.add("Pear");
        treeset.add("Banana");
        //Add Duplicate Element
        treeset.add("Pear");
        System.out.println("TreeSet : ");
        for (String temp : treeset) {
            System.out.println(temp);
        }
    }
}

/**
 * output:
 * TreeSet :
 * Apple
 * Banana
 * Pear
 */