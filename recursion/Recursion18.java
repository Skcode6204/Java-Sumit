//wap to return all the indices as Arraylist, if target element exists in the array by recursion.

import java.util.*;
public class Recursion18{
    public static ArrayList<Integer> findAllIndices(int[] arr , int n , int x, int idx){
        //base case
        if(idx >= n){
            return new ArrayList<Integer>();     // return empty Arraylist
        }

        //self work.
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == x){
            ans.add(idx);
        }

        //recursive work
        ArrayList<Integer> smallAns = findAllIndices(arr, n, x, idx+1);
        ans.addAll(smallAns);
        return ans;

    }
    public static void main(String[] args) {
        int idx = 0;
        int[] arr = {2, 3, 4, 2, 1, 2, 6, 5, 2, 8};
        int x = 2;
        int n = arr.length;
        ArrayList<Integer> ans = findAllIndices(arr, n, x, idx);
        for(Integer i : ans){
            System.out.println(i);
        }
        

        
        
    }
}