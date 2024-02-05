/* There is a race, where at a time only 'm' children is allowed to enter race, to prevent strike, we want to choose the starting point
such that the minimum distance of two of them is larger. find the larest minimum distance.
 Input :- {1 2 4 8 9}, K = 3 & Output :- 3. */

import java.util.*;
public class BinarySearch13{
    public static boolean isPossible(int[] arr, int k, int dist){
        int n = arr.length;
        int kidsPlaced = 1;
        int lastKid = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] - lastKid >= dist) {
                kidsPlaced++;
                lastKid = arr[i];
            }
        }
        return kidsPlaced >= k;

    }
    public static int raceTrack(int[] arr, int k){
        int n = arr.length;
        int strt = 0;
        int end = (int)1e9;
        int ans = -1;
        while(strt <= end){
            int mid = strt + (end - strt)/2;
            if(isPossible(arr, k, mid)){   //can k kids be placed such that no 2 kids have distances lesser than mid.
                ans = mid;
                strt = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println("req largest minimum distance between studets : "+raceTrack(arr, k));
    }
}