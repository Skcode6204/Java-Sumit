/* You have 'n'  boxes of chocolates, each contains arr[i] chocolates, you need to distribute these chocolates among 'm' no of students
 * such that the maximum no of chocolates allocated to a student is minimum
 *  Input :- n = 4;  arr[i] = {12, 34, 67, 90};  m = 2
 *  Output = 113; 
  */

import java.util.*;
public class BinarySearch12{
    public static boolean isDivisionPossible(int[] arr, int m, int mxChocAllowed){
        int numOfStudents = 1;
        int n = arr.length;
        int choc = 0;    //no of choc current student has
        for (int i=0;i<arr.length;i++){
            if(arr[i] > mxChocAllowed) return false;
            if(choc + arr[i] <= mxChocAllowed){
                choc += arr[i];   
            }else{
                numOfStudents++;   //increase the number of students as we can't add
                choc = arr[i];
            }
        }    
        return numOfStudents <= n;
    }
    public static int distributeChocolates(int[] arr, int m){   //here m = no. of student
        int n = arr.length;
        if(n < m) return -1;   //no of studnt increases the no. of chcoclates
        int ans = 0, strt = 1, end = (int)1e9;
        while(strt <= end){
            int mid = strt + (end - strt)/2;
            if(isDivisionPossible(arr, m, mid)){
                ans = mid;
                end = mid-1;
            }else{
                strt = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m = 2;
        System.out.println(distributeChocolates(arr, m));
    }
}