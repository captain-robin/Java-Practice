class BinarySearch{
    static int bSearch(int arr[],int x){
       // for(int i=0;i<n;i++)
        int low=0;int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x)
            return mid ;
            else if(arr[mid]>x)
             high=mid-1;
            else
            low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
       // int n=arr.length;
       BinarySearch bs = new BinarySearch();
        int x=20;
        int arr[]={10,20,30,40,50};
        int result=bs.bSearch(arr,x);
        if(result ==-1)
        System.out.print("Element is Not Predent");
        else
        System.out.println("Element is present in"+" index "+result);
    }
}