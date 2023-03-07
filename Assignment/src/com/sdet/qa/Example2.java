package com.sdet.qa;
public class Example2 
{
public static void main(String[] args) 
{
String input = "aaabbba";
char search = 'a';    // Character to search is 'a'.
char search1 ='b';    // Character to search is 'b'.
int count=0;
int count1=0;
for(int i=0; i<input.length(); i++)
 {
if(input.charAt(i) == search) { 
	count++;
}
else if(input.charAt(i) == search1) {
count1++;
}
else
{
System.out.println("");
}
}
System.out.println(count);
System.out.println(count1);
if (count!=count1) 
{
System.out.println("Occurences a and b is not same");
}
else {
System.out.println("Occurences a and b is same");
}
}
}