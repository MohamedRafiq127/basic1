/* Print given number is Odd or Even */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	int number=sc.nextInt();
	if(number%2==0){
	    System.out.println("Given number is even " + number);
	    }
	    else{
	        System.out.println("Given number is odd"+ number);
	    }
	}
}
