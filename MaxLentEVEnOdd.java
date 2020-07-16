import java.util.*;
public class MaxLentEVEnOdd {
    static int maxsubarr(int arr[]) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
                    count++;
                else
                    break;
            }
            res = Math.max(res, count);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,7,8};
        System.out.println(maxsubarr(arr));
    }
}