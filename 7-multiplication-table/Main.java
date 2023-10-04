/* Multiplication table */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    int i;
    System.out.println();
    for(i=1;i<=10;i++)
    { 
    System.out.println(i + " x " + num + " = " + i*num);
}
}
} 