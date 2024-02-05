// make Arraylist using oops concept.
import java.util.*;
public class oopsArraylist12{
    public static class Arraylist{
        int[] arr = new int[2];
        int idx = 0;
        int size = 0;

        // make function to add element in arraylist.
        public void add(int ele){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length*2);
                arr = brr;   //brr is renamed as arr.
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
        //function to set value.

        public void set(int idx, int val){
            arr[idx] = val;
        }
    }
    public static void main(String[] args){
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);     //here ans is size = 2.
        arr.add(5);
        System.out.println(arr.size);     //here ans is size = 3.
        arr.set(0,10);
    }
}