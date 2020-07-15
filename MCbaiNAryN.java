import java.util.*;

public class MCbaiNAryN {
    static int maxnONE(boolean arr[]) {
        int res = 0;
         int curr = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==false) curr=0;
                else{
                    curr++;
                    res = Math.max(curr,res);
            }
            
        }
        return res;
        // System.out.println(arr);
    }

    public static void main(String[] args) {
        boolean arr[] = {false,true,true,true,true ,false,true,true,true, true,true ,false };
        System.out.println(maxnONE(arr));
    }

}