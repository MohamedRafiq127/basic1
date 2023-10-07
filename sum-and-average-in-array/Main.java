/*Sum and average in array*/
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter five number ");
		int a[]=new int[5];
		int avg,sum=0;
		for (int i=0;i<a.length;i++)
		{
		    a[i]=sc.nextInt();
		}
		    for (int i=0;i<a.length;i++)
		    {
		        sum=sum+a[i];
		    }
		    System.out.println("sum="+ sum);
		    avg=sum/(a.length);
		    System.out.println("avg="+ avg);
	}
}
