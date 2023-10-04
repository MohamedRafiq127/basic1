/*Sum of 10 Natural no's*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    for(int i=1;i<=num;i++)
    {
    sum+=i;
    }
    System.out.println("sum of given natural number : " + sum);

}
} 
