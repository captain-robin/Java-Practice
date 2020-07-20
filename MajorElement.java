import java.util.*;
public class MajorElement {
    static int FindMajority(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count =1;
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]==arr[j])
            count++;
            if(count>arr.length/2)
            return i;
        }
        return -1;
    }   
    public static void main(String[] args) {
        int arr[]={8,7,6,8,6,6,6,6};
        System.out.println(FindMajority(arr));
    }
}