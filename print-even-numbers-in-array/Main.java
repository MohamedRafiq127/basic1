/*Print only even numbers in array*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Even numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number+" ");
            }
        }
    }
}





