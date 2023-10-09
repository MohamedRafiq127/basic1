/*Search in range*/
//If the given target existis in array b/t range it will show that numbers index
//If the givrn target dosent exist it will return -1
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    int [] arr={12,5,23,4,65,12,465,354,78,400};
	    int target=23;
	    System.out.println(linearsearch(arr, target, 1, 4));
		}
	static int linearsearch(int[] arr,int target,int start, int end){
	if(arr.length==0){
	    return-1;
	    }
	    for(int index=start;index<=end;index++){
	    int element= arr[index];
	    if(element==target){
	    return index;
}}
 return -1;	    
}
}
