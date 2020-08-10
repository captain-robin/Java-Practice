class ChackForTry{
    static int bSearch(int arr[],int x){
       // for(int i=0;i<n;i++)
        int low=0;int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x)
            return mid ;
            else if(arr[mid]>x)
             high=mid-1;
             else if(arr[mid]<x)
             low=mid+1;
            else{
           if(arr[mid-1]!=arr[mid])
           return mid;
        else 
        high=mid-1;
      }
    }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,5,5};
        int x=5;
    System.out.println(bSearch(arr,x));
    }
}