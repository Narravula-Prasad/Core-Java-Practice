import java.util.Scanner;

public class ReverseString {

//main method
 public static void main(String[] args) {

//declare variables and take input from user
 Scanner s=new Scanner(System.in);
System.out.println("Enter the input string : ");
String s1=s.nextLine();
//creat stringbuffer object for string reversing
StringBuffer sb=new StringBuffer(s1);

//reverse input string
//print entire string result
System.out.println("reverse the entire string : "+sb.reverse());
 }
//call reverWordInMyString method
public static String reverseWordInMyString(String s1) {
/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/
String words[]=s1.split("\\s");
    String reverseWordInMyString="";
    for(String w:words){
        sb.reverse();
        reverseWordInMyString+=sb.toString()+" ";
    }

/* 
   Use charAt() function returns the character
   at the given position in a string
*/
return reverseWordInMyString.trim();
}    
//print reverse each word string result
System.out.println("reversing each word at its place : " +reverseWordInMyString(s1));
}