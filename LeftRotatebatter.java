import java.util.Arrays;
public class LeftRotatebatter {
    public static void Fristtwo(int arr[],int n,int d){
       int temp[]=new int[d];
        for(int i=0;i<d;i++){
             temp[i]=arr[i];//temp[]={2,3}
        }
        for(int i=d;i<n;i++){
        arr[i-d]=arr[i]; //arr[]={4,5,6};
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];//arr[]={4,5,6,2,3}
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int d = 2;
        Fristtwo(arr, n, d);
        System.out.println(Arrays.toString(arr));
    }
}