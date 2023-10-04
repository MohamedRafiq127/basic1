/*Nested if condition*/
import java.util.Scanner;
public class Main
{
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a age: ");
     int age = scanner.nextInt();
     if(age>=20){
     System.out.println("Enter a salary: ");
     int salary = scanner.nextInt();
     if(salary>=25000){
     System.out.println(age+" "+salary+" "+"loan sanctioned");
    }
      else
      System.out.println("Loan rejected");
    }
      else{
      System.out.println("not eligible to loan");
}


}
} 