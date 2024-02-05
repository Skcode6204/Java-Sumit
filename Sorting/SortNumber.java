/*  Given an Array where all its elements are sorted in increasing order except two swapped elements,
sort it in linear time . Assume there are no duplicatesin the Array */


import java.util.*;
public class SortNumber{
    public static void printArray(int[] num){
        for(int val = 0; val < num.length; val++){
            System.out.println(num[val]+" ");
        }
    }
    public static void sortNumber(int[] num){
        int n = num.length;
        int x = -1;
        int y = -1;
        if(n <= 1) return;  //corner case or edge case.

        for(int i=1; i<n; i++){
            if(num[i-1] > num[i]){   //1st conflict.
                if(x == -1){
                    x = i-1;
                    y = i;
                } else {            //2nd conflict.
                    y = i;
                }
            }
        }

        //swap num[x] & num[y].
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }
    public static void main(String[] args) {
        int[] num = {3, 8, 6, 7, 5, 9};
        System.out.println("Array before Sorting :");
        printArray(num);
        System.out.println("Array after Sorting :");
        //sortNumber(num);
        printArray(num);
        sortNumber(num);
    }
}