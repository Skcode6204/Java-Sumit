/* There are N stones 0,1,2....N-1. For each i(0<=i<=N), the height of stone i is 'hi'. there is a frog who is initially
on stone 0. he will repeat the following action some number of times to reach stone N-1.
If the frog is currently on stone i, jump to stone i+1 or stone i+2.
Here, a cost of |hi = hj| is incurred, where j ois the stone to land on.

Find the minimum possible total cost incurred before  the frog  reaches Stone N.
Input - n = 4
arr[] = 10, 30, 40, 20.
output - 30.
 */

import java.util.*;
public class Recursion27{
    public static int bestCost(int[] h, int n, int idx){
        //base case.
        if(idx == n - 1) return 0;
        
        //Recursion work
        int opt1 = Math.abs(h[idx] - h[idx+1]) + bestCost(h, n, idx+1);
        if(idx == n - 2) return opt1;
        int opt2 = Math.abs(h[idx] - h[idx+2]) + bestCost(h, n, idx+2);

        //self work.
        return Math.min(opt1, opt2);

    }
    public static void main(String[] args) {
        int idx = 0;
        int[] h = {10, 30, 40, 20};

        System.out.println("required best cost is :"+bestCost(h, h.length, idx));
    }
}