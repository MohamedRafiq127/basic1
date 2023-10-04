/* Factorial number */
import java.util.Scanner; 
public class Main 
{ 
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    int num=sc.nextInt();
    long x=1; //x-let x be factorial number
    int i;
    for (i=1;i<=num;i++)
    {
      x=x*i;  
    }
    System.out.println("Factorial number is " + x);
    }
    
}