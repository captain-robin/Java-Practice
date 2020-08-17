class LastOccarenceNum{
    static int lestElement(int arr[],int n){
        int x=0; int y=arr.length-1;
        while(x<=y){
            int mid =(x+y)/2;
            if(arr[mid]<x)
            x=y+1;
            else if(arr[mid]>2)
            x=mid-1;
            else{
                if(arr[mid-1]!=arr[mid] & arr[mid-1]!=arr[mid])
                return mid;
                else
                x=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,10,10,10,10,10,20,20};
        int n=10;
        System.out.println(lestElement(arr,n));
    }
}