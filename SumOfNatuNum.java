
public class SumOfNatuNum {
    static int fun(int n){
        if(n==0)
        return 0;
        else{
            return n+fun(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fun(n));
    }
}