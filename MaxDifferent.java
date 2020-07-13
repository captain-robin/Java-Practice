import java.util.*;
public class MaxDifferent {
     int maxDif(int arr[]) {
        int res = arr[1] - arr[0];
        int i,j;
        for (i = 0; i<arr.length; i++) {
            for ( j = i + 1; j<arr.length; j++) {
                if (arr[j] - arr[i] > res);
                    res = arr[j] - arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MaxDifferent maxdiff = new MaxDifferent();
        int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
        // int n=arr.length;
        System.out.println("MAX Difference is:"+maxdiff.maxDif(arr));
    }
}