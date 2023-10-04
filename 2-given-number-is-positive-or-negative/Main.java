/*Find given number is Positive or Negative*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number");
     	int number=sc.nextInt();
     	if (number>0){
     	    System.out.println("Given number is Positive "+ number);     
     	    }
     	    else if(number<0){
     	        System.out.println("Given number is Negative "+ number);
     	    }else{
     	        System.out.println("Given number is Neutral "+ number);
     	    }
	}
}
