import java.util.*;
public class countSubset {
static int countsubset(int arr[],int n, int sum){
    if (n==0){
        if(sum==0)
        return 1;
        else
        return 0;
    }
        
    return countsubset(arr,n-1,sum)+
     countsubset(arr,n-1,sum-arr[n-1]);
  }
  public static void main(String[] args) {
      int arr[]={10,20,15};
      int sum=25;
      int n=arr.length;
      System.out.println(countsubset(arr, n, sum));
  }
}