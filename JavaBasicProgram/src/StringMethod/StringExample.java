package StringMethod;

public class StringExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //charAt
        String s = "Excellarate";
        String s1 = "Excellarate";
        String s2 = "EXCELLARATE";
        String e = "Enchora";
        char result = s.charAt(0);//specified char index
        System.out.println(result);

        //code pointAt
        int result1 = s.codePointAt(0);//Ascii value of s=83;
        System.out.println(result1);

        //code PointBefore
        int result2 = s.codePointBefore(1);//print the unicode value char     before the specified index in a string.
        System.out.println(result2);

        //code pointCount
        int result3 = s.codePointCount(0, 8);//start index and stop index
        System.out.println(result3);

        //compareTo
        int result4 = s.compareTo(s1);//if 0 means equal
        int result5 = s.compareTo(e);//if more than 0 means not equal
        System.out.println(result4);
        System.out.println(result5);

        //compare to IngnoreCase
        int result6 = s.compareToIgnoreCase(s2);//same compare but, In  lower,upper char at ignoring
        System.out.println(result6);

        //concat
        System.out.println(s.concat(e));

        //contains
        System.out.println(e.contains("ll"));//true
        System.out.println(e.contains("y"));//false

        //contentEquals
        System.out.println(e.contentEquals("Excell"));
        System.out.println(e.contains("Excellarate"));//contains is exact same sequence of char
        char[] e1 = {'h', 'e', 'l', 'l', 'o'};
        String e2 = "";
        e2 = e2.copyValueOf(e1, 0, 5); //This method returns a new string array 		and copies the character into it.
        System.out.println("Returning String:" + e2);

        //endswith
        System.out.println(s.endsWith("rate"));//check whether a string end with specified char
        System.out.println(s.endsWith("chora"));

        //startwith
        System.out.println(s.startsWith("Excell"));
        System.out.println(s.startsWith("Ench"));

        //equals
        System.out.println(s.equals(e));

        //equalIgnoreCase
        String r = "HELLO";
        String r1 = "hello";
        System.out.println(r.equalsIgnoreCase(r1));//true

        //indexof
        String poet = "be late happy birthday";
        System.out.println(poet.indexOf("i"));//index of first occurance char
        //lastindexof
        System.out.println(poet.lastIndexOf("y"));//index of last occurance char

        //isempty
        System.out.println(poet.isBlank());//false
        String z = "";
        System.out.println(z.isEmpty());//true

        //length
        System.out.println(s.length());
        System.out.println(e.length());

        //replace
        String z1 = "Rajashree is live in Pune";
        System.out.println(z1.replace("Pune", "Mumbai"));

        //replacefirst
        System.out.println(z1.replaceFirst("Rajashree", "Adhiraj"));

        //replaceAll
        System.out.println(z1.replaceAll("Pune", "Solapur"));

        //Trim()
        String v1 = "                 hello i am rajashree .";
        System.out.println(v1);
        System.out.println(v1.trim());
    }
}