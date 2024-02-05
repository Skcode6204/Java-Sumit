// String Builders.

import java.util.*;
public class String3{
    public static void main(String[] args) {
        /*StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);

        //setCharAt() and append();
        // convert Hello --> Mello.
        str.setCharAt(0, 'M');
        System.out.println(str);      // O/P - Mello.
        str.append("Dello");
        System.out.println(str);      // O/P - MelloDello.
        str.append("10");
        System.out.println(str);       // O/P - MelloDello10.

        //Insert(idx, ch) and deleteCharAt(ch).
        str.insert(2, 'y');
        System.out.println(str);       // O/p - MeylloDello10.

        str.deleteCharAt(0);
        System.out.println(str);       // O/P - eylloDello10 */

        
        // reverse() and delete(i, j).

        StringBuilder sb = new StringBuilder("Sumit");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.delete(2, 5);            //where 2 included and 5 excluded.
        System.out.println(sb);      // Sumit --> 
        

    }
}