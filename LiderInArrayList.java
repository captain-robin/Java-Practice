import java.util.*;
public class LiderInArrayList {
  public static void FindLIder(int arr[],int n){
      int cur_lid=arr[n-1];
      System.out.println(cur_lid);
      for(int i=n-2;i>=0;i--){
         if(cur_lid<arr[i]){
             cur_lid=arr[i];
             System.out.println(cur_lid);
         }
      }
  }    
  public static void main(String[] args) {
      int arr[]={7,10,4,10,6,5,2};
      int n=arr.length;
      FindLIder(arr, n);
     // System.out.println(Arrays.toString(arr));
  }
}