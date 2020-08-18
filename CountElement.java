class CountElement{
     static int OccurentElement(int arr[],int n){
        int res =0;
        for(int i=0;i<arr.length;i++)
        if (n==arr[i])
        res++;
        return res;
     }
     public static void main(String[] args) {
         int arr[]={5,5,5,5,2,2,2};
         int n=2;
         System.out.println(OccurentElement(arr,n));
     }
}