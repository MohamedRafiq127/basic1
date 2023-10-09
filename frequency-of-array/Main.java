public class Main 
{ 
    public static void main(String[] args) { 
    int a[]={1,2,2,6,6,9,1,5,5,5}; 
    int freq[]=new int[a.length]; 
        for(int i=0;i<a.length;i++){ 
        freq[i]=-1; 
        } 
        for(int i=0;i<a.length;i++){ 
        int count=1; 
        for(int j=i+1;j<a.length;j++){ 
            if(a[i]==a[j]){ 
            count++; 
            freq[j]=0; 
              } 
    } 
    if(freq[i]!=0){ 
    freq[i]=count; 
    } 
    } 
    for(int i=0;i<a.length;i++){ 
    if(freq[i]!=0){ 
    System.out.println("Frequecy of Element " + a[i] + " :occurs " + freq[i] + " times" ); 
} 
} 
} 
}