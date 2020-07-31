class EqulibrimPoint{
    static int equlib(int a[],int n){
        int l_sum=0; int r_sum=0;
        for(int i=0;i<n;i++)
           r_sum+=a[i];
              for(int i=0;i<n;i++){
           l_sum-=a[i];
          if(l_sum==r_sum)
        return i;
    l_sum+=a[i];
          
        }
       return -1;
    }
    public static void main(String[] args) {
        EqulibrimPoint equi=new EqulibrimPoint();
          int a[]={-7, 1, 5, 2, -4, 3, 0};
          int n=a.length;
        System.out.println(equi.equlib(a,n));
    }
}