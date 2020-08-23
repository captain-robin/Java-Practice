
public class FindPeak {
    static int getPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        if (arr[0] > arr[1])
            return 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid]))
                return mid;
            if (mid > 0 && arr[mid - 1] >= arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 5,200,300,20,50,60};
        System.out.println(getPeak(arr));
    }
}