
public class ReAddision {
    static int addision(int n) {
        if (n < 10)
            return n;

        return addision(n / 10) + (n % 10);
        //System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 243;
        int result =addision(n);
        System.out.println(result);
    }
}