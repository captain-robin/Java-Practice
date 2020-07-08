import java.util.*;
public class DeletArray {
    static int delet(int arr[],int n,int x){
    int i;
    for (i=0;i<n;i++)
       if(arr[i]==x)
       break;
       if(i==n)
       return n;
       for(int j=i;j<-1;i++)
       arr[i]=arr[i+1];
       return(n-1);
    }
    public static void main(String[] args) {
      int arr[]={12,34,45,13,16};
      int n=arr.length;
      int x=45; 
      n=delet(arr, n, x);
      System.out.println("Modifire array is ");
      for(int i=0;i<n;i++)
      System.out.println(arr[i]); 
    }
}