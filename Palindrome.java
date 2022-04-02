import java.util.Scanner;

public class Palindrome {

//main method
 public static void main(String[] args)

//declare varible
 {
  Scanner s=new Scanner(System.in);
   String n=s.nextLine();
    n=n.toLowerCase();

//take input from user

/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/
int i=0, j=n.length()-1;
     while(i<j){
         if(n.charAt(i) != n.charAt(j)){
             System.out.println(n+" is not a Palindrome"); }
         i++;
         j--;
     }
     System.out.println(n+" is a Palindrome");
 }
}