/*Linear search*/
//find the index of given num in array 
public class Main
{
	public static void main(String[] args) {
	    int []num ={1,2,3,5,6,9,78,15,12,47,-14,-568,45,98};
	    int target=78;
	    int ans=linearsearch(num, target);
	    System.out.println(ans);
		
	}
	//search a item in best case and return the index as output
	//otherwise if item notforund return -1;
	static int linearsearch(int []arr,int target ) {
	    if (arr.length ==0){
	       return-1; 
	    }
	        for (int index=0;index<arr.length;index++){
	            int element=arr[index];
	            if(element==target){
	                return index;
	            }
	          	}
	          	return-1;
}
}
//Find the given number and retutn the element itself
/*	static int linearsearch(int []arr,int target ) {
 	    if (arr.length ==0){
 	       return Integer.MAX.VALE; 
 	    }
 	        for (int index=0;index<arr.length;index++){
 	            int element=arr[index];
	            if(element==target){
 	                return element;
 	            }
 	          	}
 	          	return Integer.MAX.VALE;*/

// find the given number and return in boolean fortamt

/*	static boolean linearsearch(int []arr,int target ) {
	    if (arr.length ==0){
	       return false; 
	    }
	        for (int index=0;index<arr.length;index++){
	            int element=arr[index];
	            if(element==target){
	                return true;
	            }
	          	}
	          	return false;
}
} */