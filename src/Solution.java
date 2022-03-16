import java.sql.Array;
/*
Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

Examples (Input -> Output):
* "String"      -> "SSttrriinngg"
* "Hello World" -> "HHeelllloo  WWoorrlldd"
* "1234!_ "     -> "11223344!!__  "
 */
public class Solution {
    public static void main(String[] args)
    {
        String s="Java";
        doubleChar(s);
    }
    public static void doubleChar(String s){
        char[] str=s.toCharArray();
        char[] newStr= new char[(str.length)*2];
        int j=0;
        for (int i=0;i< newStr.length;i=i+2) {
            newStr[i]=str[j];
            newStr[i+1]=str[j];
            j++;
        }
        System.out.println(newStr);
    }
}
