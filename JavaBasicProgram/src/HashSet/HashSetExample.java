package HashSet;

import java.util.HashSet;

/**
 * problem statement:
 * write program for hashSet in java.
 */
public class HashSetExample {
    public void displayhashMap() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Good");
        hashSet.add("For");
        hashSet.add("Health");
        //Add Duplicate Element
        hashSet.add("Good");
        System.out.println("HashSet: ");
        for (String temp : hashSet) {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        HashSetExample hashset = new HashSetExample();
        hashset.displayhashMap();
    }
}
/**
 * output
 * HashSet:
 * Health
 * For
 * Good
 */

