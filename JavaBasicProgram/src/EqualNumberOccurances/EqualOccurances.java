package EqualNumberOccurances;

/**
 * problem statement:
 * Given a string s, return true if s is a good string, or false otherwise.
 * A string s is good if all the characters that appear in s have the same number of occurrences
 */
public class EqualOccurances {
    public static boolean EqualNumberOccurances(String input) {
        boolean output = true;
        int firstCount = 1;
        for (int count = 0; count < input.length(); count++) {
            char search = input.charAt(count);
            int secondCount = 1;
            for (int i = 0; i < input.length(); i++) {
                if (count == i) continue;
                if (search == input.charAt(i)) {
                    if (count == 0) {
                        firstCount++;
                    }
                    secondCount++;
                }
            }
            if (firstCount != secondCount) {
                output = false;
                return output;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        boolean output = EqualNumberOccurances("abacbc");
        if (output == false)
            System.out.println("All Characters Have Different Number of Occurrences");
        else
            System.out.println("All Characters Have Equal Number of Occurrences");
    }
}
/**
 * output:
 * All Characters Have Equal Number of Occurrences
 */