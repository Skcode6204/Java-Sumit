

import java.util.*;
public class Arraylist{
    public static void main(String[] args){
        //wrapper class
        Integer in = Integer.valueOf(4);
        System.out.println(in);
        Float f = Float.valueOf(3.5f);
        System.out.println(f);
        Boolean b = Boolean.valueOf(true);
        System.out.println(b);

        ArrayList<Integer> l1 = new ArrayList<>();
        //ArrayList<Float> l2 = new ArrayList<>();
        //ArrayList<Boolean> l3 = new ArrayList<>();

        //Add new element
        l1.add(5);   //[5, 6, 7, 8]
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index i.
        System.out.println(l1.get(1));    //6.

        //print with for loop.
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));  //5, 6, 7, 8
            
        }

        //printing the array list directly.
        System.out.println(l1);     //[5, 6, 7, 8]

        //adding the element at some index i. [5, 100, 6, 7, 8]
        l1.add(1, 100);
        System.out.println(l1);

        //modifying elements at index i.  
        l1.set(1, 10);           //[5, 10, 6, 7, 8]
        System.out.println(l1);

        //removing an element at index i.
        l1.remove(1);              //[5, 6, 7, 8]
        System.out.println(l1);

        //removing an element e.
        System.out.println(l1.remove(Integer.valueOf(7)));
        System.out.println(l1);                //true [5, 6, 8]

        //checking if an element exists.
        boolean ans = l1.contains(Integer.valueOf(6));     //true
        System.out.println(ans);

        //if you don't specify class, you can put anything inside l.
        ArrayList l = new ArrayList();
        l.add("sumit");               //[sumit, 4, true]
        l.add(4);
        l.add(true);
        System.out.println(l);




        
    }
}