import java.util.Arrays;

public class LeftShiOne {
    public static void leftShiftOne(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        leftShiftOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}