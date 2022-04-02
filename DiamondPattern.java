public class DiamondPattern {

//Add main method here
public static void main(String[] args)
{

//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)
int k=4,m,ch=97;
//use for loop and if condition to print a,b,c 
for(int i=0;i<=k;i++)
{
   for(int j=1;j<=2;j++)
   {
   for(int j=1;j<=2*i-1;j++){
      System.out.print((char)ch+" ");
      ch+=1;
   }
   }
   System.out.println("\n");
  
}
   for(int i=k-1;i>=1;i--)
   {
      for(int j=1;j<=k-i;j++){
       System.out.print(" ");
      for(int j=1;j<=2*i-1;j++){
         System.out.println((char)ch+" ");
         ch+=1;
      }
      }
      System.out.print("\n");

   }
}
}