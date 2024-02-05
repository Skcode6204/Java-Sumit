//find the square root. I/P : x = 24, O/P :- 4 (we ignore the rest decimal and round to lowest or nearest integer. )

import java.util.*;
public class BinarySearch4{
    public static int findSqrt(int x){
        int strt = 0;
        int end = x;
        int ans = -1;

        while(strt <= end){
            int mid = strt + (end - strt)/2;
            int val = mid * mid;
            if(val == x){
                ans = mid;
            }else if(val < x){
                ans = mid;
                strt = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int x = 24;
        System.out.println("square root of "+x+" is : "+findSqrt(x));
    }
}