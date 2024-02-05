//wap to reverse the array using ArrayList.

import java.util.*;
import java.util.Collections;


public class ArrayListprob1{
    public static void reverseList(ArrayList<Integer> list){
        int i=0; int j=list.size() - 1;

        while(i<j){

            /*
             * int temp = a;
             * a = b;
             * b = temp;
             */

            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);

        i++;
        j--;
        }  
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(34);

        System.out.println("Original arrayList "+list);
        reverseList(list);
        System.out.println("Reversed List "+list);
        Collections.sort(list);
        System.out.println("Ascending Order "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order "+list);


        //sorting of string in array.
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("My");
        l1.add("name");
        l1.add("is");
        l1.add("sumit");
        System.out.println("Original Array "+l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Sorted"+l1);

    }
}