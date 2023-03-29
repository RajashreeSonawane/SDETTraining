package HashSet;

import java.util.HashSet;

/**
 * problem statement:
 * write program for hashSet in java.
 */
public class hashsetExample {
    public static void main(String[] args) {
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
}

/**
 * output
 * HashSet:
 * Health
 * For
 * Good
 */

