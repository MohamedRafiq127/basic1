/*Reverse a string*/
import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String ");
	String str=sc.nextLine();
	String rev;
	 rev=" ";
	 int n=str.length();
	 int i;
	 for (i=n-1;i>=0;i--)
	 {
	     rev=rev+str.charAt(i);
	 }
	 System.out.println("Reversed string is "+ rev);
	}
}
