import java.util.Scanner;

public class DisplayDay {
  public static void main(String[] args)
  {

//declare number variable

//Use the scanner class to provide input at execution time using scanner object
Scanner s= new Scanner(System.in);
    System.out.print("Input number: ");
    int n=s.nextInt();
    System.out.println(getDayName(n));
  }

/*
Take input of the number for displaying day
System.out.println("Enter value for displaying day:");
number=sc.nextInt();
*/

//Declare switch case and check the input value to print the day entered by the user
 public static String getDayName(int n)
 {
   string day=" ";
   switch(day){
       case 1:day="Monday";
       break;
     case 2:day="Tuesday";
       break;
      case 3:day="Wednesday";
      break;
     case 4:day="Thursday";
       break;
     case 5:day="Friday";
       break;
     case 6:day="Saturday";
       break;
      case 7:day="Sunday";
       break;
     default:day="Invalid day range";
   }
   return day;
       
}