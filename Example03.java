public class Example03 {
    static int SquireRoot(int n){
        int i=1;
        while(i*i<=n)
        i++;
        return(i-1);
    }
    public static void main(String[] args) {
        int n=15;
        System.out.println(SquireRoot(n));
    }
}