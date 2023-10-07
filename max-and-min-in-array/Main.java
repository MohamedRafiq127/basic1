/*Find max and min in array*/
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    int [] arr={12,23,45,1,2,3,46,98,658,47};
		System.out.println(max(arr));
	}
// static int min(int []arr){
//     int ans=arr[0];
//     for (int i=0;i<arr.length;i++){
//     if (arr[i]<ans){
//         ans=arr[i];
//     }}
//     return ans;

// }
// }
static int max(int []arr){
    int ans=arr[0];
    for (int i=0;i<arr.length;i++){
    if (arr[i]>ans){
        ans=arr[i];
    }}
    return ans;

}
}
