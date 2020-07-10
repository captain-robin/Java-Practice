import java.util.*;
public class SortedArray {
  public static boolean isSorted(int arr[]){
       for(int i=0;i<arr.length;i++){
         if(arr[i]<arr[i+1]){
         return true;}
         else { 
         return false;} 
         }
         return false;
   } 
   public static void main(String[] args) {
       int arr[]={2,5,6,7,9};
       System.out.println(isSorted(arr));
   }   
}