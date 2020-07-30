class PreFisSum{
    static void prefixsume(int arr[],int n,int pre_sum[]){
        pre_sum[0]=arr[0];
        for(int i=1;i<n;i++)
        pre_sum[i]=pre_sum[i-1]+arr[i];

    }
    public static void main(String[] args) {
        int arr[]={ 10, 4, 16, 20};
        int n=arr.length;
        int pre_sum[]=new int [n];
        prefixsume(arr,n,pre_sum);
        for(int i=0;i<n;i++)
        System.out.print(pre_sum[i]+"  ");
        System.out.println("");
    }
}