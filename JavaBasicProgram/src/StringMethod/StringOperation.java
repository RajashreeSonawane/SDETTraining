package StringMethod;

/**
 * problem statement:
 * Practice all String method example
 * Create a class, create a sample string in it and perform all possible methods on it.
 */
public class StringOperation {
    public void display() {
        //charAt
        String string = "Excellarate";
        String firststring = "Excellarate";
        String secondstring = "EXCELLARATE";
        String thirdstring = "Enchora";
        char result = string.charAt(0);//specified char index
        System.out.println(result);

        //code pointAt
        int result1 = string.codePointAt(0);//Ascii value of s=83;
        System.out.println(result1);

        //code PointBefore
        int pointBeforeresult = string.codePointBefore(1);//print the unicode value char     before the specified index in a string.
        System.out.println(pointBeforeresult);

        //code pointCount
        int pointCount = string.codePointCount(0, 8);//start index and stop index
        System.out.println(pointCount);

        //compareTo
        int stringone = string.compareTo(firststring);//if 0 means equal
        int stringtwo = string.compareTo(thirdstring);//if more than 0 means not equal
        System.out.println(stringone);
        System.out.println(stringtwo);

        //compare to IngnoreCase
        int ignoreCaseresult = string.compareToIgnoreCase(secondstring);//same compare but, In  lower,upper char at ignoring
        System.out.println(ignoreCaseresult);

        //contentEquals
        System.out.println(thirdstring.contentEquals("Excell"));
        System.out.println(thirdstring.contains("Excellarate"));//contains is exact same sequence of char
        char[] e1 = {'h', 'e', 'l', 'l', 'o'};
        String e2 = "";
        e2 = e2.copyValueOf(e1, 0, 5); //This method returns a new string array 		and copies the character into it.
        System.out.println("Returning String:" + e2);

        //endswith
        System.out.println(string.endsWith("rate"));//check whether a string end with specified char
        System.out.println(string.endsWith("chora"));

        //startwith
        System.out.println(string.startsWith("Excell"));
        System.out.println(string.startsWith("Ench"));

        //equals
        System.out.println(string.equals(thirdstring));

        //equalIgnoreCase
        String fourthstring = "HELLO";
        String fifthstring = "hello";
        System.out.println(fourthstring.equalsIgnoreCase(fifthstring));//true

        //indexof
        String poet = "be late happy birthday";
        System.out.println(poet.indexOf("i"));//index of first occurance char
        //lastindexof
        System.out.println(poet.lastIndexOf("y"));//index of last occurance char

        //isempty
        System.out.println(poet.isBlank());//false
        String name = "";
        System.out.println(name.isEmpty());//true

        //length
        System.out.println(string.length());
        System.out.println(thirdstring.length());

        //replace
        String stringrepalce = "Rajashree is live in Pune";
        System.out.println(stringrepalce.replace("Pune", "Mumbai"));

        //replacefirst
        System.out.println(stringrepalce.replaceFirst("Rajashree", "Adhiraj"));

        //replaceAll
        System.out.println(stringrepalce.replaceAll("Pune", "Solapur"));

        //Trim()
        String trimstring = "                 hello i am rajashree .";
        System.out.println(trimstring);
        System.out.println(trimstring.trim());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringOperation operation = new StringOperation();
        operation.display();
    }
}

/**
 * output:
 * E
 * 69
 * 69
 * 8
 * 0
 * 10
 * 0
 * false
 * false
 * Returning String:hello
 * true
 * false
 * true
 * false
 * false
 * true
 * 15
 * 21
 * false
 * true
 * 11
 * 7
 * Rajashree is live in Mumbai
 * Adhiraj is live in Pune
 * Rajashree is live in Solapur
 * hello i am rajashree .
 * hello i am rajashree .
 */