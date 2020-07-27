class PrefixedSum{
     static int preSum(int a[],int n){
     int sum=0;
     for(int i=0;i<n;i++)
     sum+=a[i];
     return sum;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,3,5,7,8};
        int n=a.length;
        //int n=1;
        System.out.println(preSum(a,n));
    }
}