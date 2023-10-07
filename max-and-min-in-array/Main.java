/*Find largest and smallest number in array*/
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    int [] arr={7,9,4,2,1};
	    System.out.println(" The smallest of given number is: "+ min(arr));
	//	System.out.println(" The Largest of given number is: "+ max(arr));
	}
 static int min(int []arr){
    int ans=arr[0];
    for (int i=0;i<arr.length;i++){
    if (arr[i]<ans){
        ans=arr[i];
    }}
    return ans;

}
}
// static int max(int []arr){
//     int ans=arr[0];
//     for (int i=0;i<arr.length;i++){
//     if (arr[i]>ans){
//         ans=arr[i];
//     }}
//     return ans;

// }
// }
