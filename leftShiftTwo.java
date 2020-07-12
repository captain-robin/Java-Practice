import java.util.*;
public class leftShiftTwo {
    public static void leftShiftOne(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
    public static void leftRotate(int arr[],int d){
        for(int i=0;i<d;i++){
            leftShiftOne(arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int d=2;
        leftRotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}