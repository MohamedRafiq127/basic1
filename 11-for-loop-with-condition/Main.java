/* print from 1-50 using for loop 
if a number%3 print accord 
if number%5 print infomatrix 
if number%3 and %5 print accord infomatrix else print number */

import java.util.Scanner; 
public class Main 
{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number:"); 
        int num = sc.nextInt(); 
        for(int i=1;i<=num;i++){ 
        if(i%3==0 && i%5==0){ 
        System.out.println("accord infomatrix"); 
        } 
        else if(i%3==0){ 
        System.out.println("accord"); 
        } 
        else if(i%5 ==0){ 
        System.out.println("infomatrix"); 
        } 
        else{ 
        System.out.println(i); 
    } 
    } 
} 
} 