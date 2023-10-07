/*Move 0 from array to last*/
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int [] a={1,2,3,4,5,0,1,4,1,0,12,14,0,51,6};
	    System.out.print("The inputs are " );
	    for (int i=0;i<a.length;i++)
	    System.out.print(a[i]+ " ");
	    System.out.print("\nThe output is: ");
		for (int i=0;i<a.length;i++)
		{
		    if(a[i]==0)
		    {
		        for (int j=1+i;j<a.length;j++)
		        {
		            //check condition.
		            if(a[j]!=0)
		            {
		                a[i]=a[j];
		                a[j]=0;
		                break;
		            }}}}
		            for (int i=0;i<a.length;i++)
		            { 
		             System.out.print(a[i]+ " ");
		   	}
	}
}
