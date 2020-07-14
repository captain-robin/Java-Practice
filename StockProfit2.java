import java.util.*;
public class StockProfit2 {
    static int stockpro(int arr[]){
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])
            profit=profit+(arr[i]-arr[i-1]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,8,12};
        stockpro(arr);
        System.out.println(stockpro(arr));
    }
}