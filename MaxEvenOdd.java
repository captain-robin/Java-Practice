
public class MaxEvenOdd {
    static int maxsubarr(int arr[]) {
        int res = 1;
        int count = 1;
        for (int j = 1; j < arr.length; j++) {
            if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                 count++;
                res = Math.max(res, count);
            } 
            else
                count = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 6, 3, 8 };
        System.out.println(maxsubarr(arr));
    }
}
