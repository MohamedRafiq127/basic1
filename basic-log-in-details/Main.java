/*Basic log in details*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	    String username="Rafi";
	    String password="1234";
	    System.out.println("Enter the userid: ");
	    String userid=sc.next();
	    System.out.println("Enter the passid: ");
	    String passid=sc.next();
	    if(userid.equals(username)&&passid.equals(password))
	    {
	        System.out.println("Login successfully");
	    }
	    else
	    System.out.println("Login failed");
	    
	}
}
