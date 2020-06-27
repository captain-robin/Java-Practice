public class PracticeRe{
    static int fun(int n){
        if(n==0)
        return 0;
        else
        fun(n/2);
        System.out.println(n%2);
        return 1;
    }
    public static void main(String[] args) {
        int n=12;
        fun(n);
    }
}