
public class RecursionP2 {
   static int fun(int n){
       if (n==0)
       return 0;
       fun(n-1);//n will start from 4 but when we will use (n-1) the it will decress 4,3,2,1 and print from 1234
       System.out.println(n);
       return 0;
   }    
   public static void main(String[] args) {
       int n=4;
       fun(n);
   }
}