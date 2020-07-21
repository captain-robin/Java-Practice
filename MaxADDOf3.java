public class MaxADDOf3 {
    static int count3elementmax(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < k - 1; i++) {
            count += arr[i];
            int curr_sum = count;
            for (int j = k-1; j < arr.length; j++) {
                count += (arr[i] - arr[i - k-1]);
                curr_sum = Math.max(curr_sum, count);
            }
            // return curr_sum;
        }
        return curr_sum;
    }

    public static void main(String[] args) {
        int k = 3;
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(count3elementmax(arr, k));

    }
}