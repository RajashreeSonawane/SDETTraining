package TreeSet;

import java.util.TreeSet;

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