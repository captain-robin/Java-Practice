import java.util.*;
public class revarceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter The array list");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = arr[start];
            start++;
            end--;
        }
        System.out.println("print an array After swap");
        for (int j = 0; j < n; j++){
        System.out.println(arr[j]);
    }

    }
}