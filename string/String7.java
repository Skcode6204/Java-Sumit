/*  The String should be compressed such that consecutive  duplicates of character are replaced with the 
character and followed by the number of consecutive duplicates.
I/P - aaabbbbccddde       O/P - a3b4c2d3e1 */

import java.util.*;
public class String7{
    public static void main(String[] args) {
        String str = "aaabbbbccddde";
        System.out.println("Input string : "+str);
        String ans = "" + str.charAt(0);

        int count = 1;
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){          
                count++;             // aaa -> a3.
            }else{
                ans = ans + count;     // a3 + count i.e, b.
                count = 1;
                ans = ans + curr;        // a3 + count i.e, b --> a3b
            }
        }
        ans = ans + count;
        System.out.println("required output String is : "+ans);
    }
}