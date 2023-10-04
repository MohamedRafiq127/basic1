/* Prime number*/
 
import java.util.Scanner; 
public class Main 
{ 
    public static void main(String[] args) { 
        int i,j,count=0;
    Scanner sc = new Scanner(System.in); 
     System.out.println("Enter a number:"); 
     int num= sc.nextInt(); 
     for( i=2;i<=num;i++){ 
     boolean isPrime = true; 
     for( j=2;j<i;j++){ 
     if(i%j==0){ 
     isPrime=false; 
     break; 
    } 
    } 
    if(isPrime){ 
    System.out.print(i+" "); } 
} 
} 
} 