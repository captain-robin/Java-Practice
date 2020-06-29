import java.io.*;
import java.util.*;
public class RoadCutting {
  static int rodCutting(int n,int a,int b,int c){
      if(n==0) 
      return 0;
      if(n<0)
      return -1;
      int res =Math.max(Math.max(rodCutting(n-a, a, b, c),rodCutting(n-b, a, b, c)),rodCutting(n-c, a, b, c));
      if(res==-1)
        return -1;
      return 1 + res;
    }    
    public static void main(String[] args) {
        int n=25;
        int a=11,b=12,c=13;
        System.out.println(rodCutting(n, a, b, c));
    }
}