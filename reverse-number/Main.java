/*Reverse number*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int i;
	for (i=num;i>=1;i--)
	{
	    System.out.print(i+ " ");
	}
	}
}
