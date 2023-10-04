/* Largest of 3 numbers*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the first number");
	    int num1=sc.nextInt();
	    System.out.println("Enter second number");
	    int num2=sc.nextInt();
	    System.out.println("Enter third number");
	    int num3=sc.nextInt();
	    
	    int largest=num3>(num1>num2?num1:num2)?num3:(num1>num2?num1:num2);
	    System.out.println("The largest number is "+ largest);
	    
	}
}
