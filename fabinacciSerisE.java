
public class fabinacciSerisE {
    static int fib(int n) {
        if (n <= 1)
            return n;
        else {
            return fib(n - 1) + fib(n - 2);
           // System.out.println(n
        }
    }

    public static void main(String[] args) {
        int n = 4;
        fib(n);
         System.out.println(fib(n));
    }
}
