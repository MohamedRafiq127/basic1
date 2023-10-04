/*Print even numbers from 0 to 20*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = sc.nextInt();
    System.out.println("Even numbers between ranges are: ");
    int i;
    for(i=2;i<=number;i=i+2)
    {
        System.out.print(i+" ");
    }
    }
    }