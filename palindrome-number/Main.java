/* palindrome Number */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num= sc.nextInt();
	int orig_num=num,rev=0;
	while(num!=0)
	{
	     rev=rev*10+num%10;
	     num=num/10;
	}
	if(orig_num==rev){
	    System.out.println("Given number is palindrome "+ rev);
	}	
	else
	System.out.println("Given number is not palindrome");
	}	
}
