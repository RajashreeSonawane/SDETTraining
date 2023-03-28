package Assignment;

public class EqualOccurances {
    public static boolean EqualNumberOccurances(String input) {
        boolean output = true;
        int firstCount = 1;
        int secondCount = 1;
        for (int count = 0; count < input.length(); count++) {
            char c = input.charAt(count);

            for (int i = 0; i < input.length(); i++) {
                if (count == i) continue;
                if (c == input.charAt(i)) {
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
        if (output == false) System.out.println("All characters have not equal number of occurances");

        else System.out.println("All characters having equal number of occurances");
    }
}

