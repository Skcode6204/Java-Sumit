// String Basic  

//You can run any certain code by commenting rest of the code.

import java.util.*;
public class StringBasic2{
    public static void main(String[] args) {
        // String + int/char/String.
        /*String str = "abc";
        str = str + "xyz";
        str = str + 10;
        System.out.println("abc"+10+20);    // this give o/p = abc1020
        System.out.println("abc"+(10+20));  //this give o/p = abc30
        System.out.println(10+20+"abc");    //this give o/p = 30abc*/

        //Substring(i,j) & substring(i)
        String str = "abcde";
        System.out.println(str.substring(1,4));     // gives output = "bcd".
        System.out.println(str.substring(2));       // gives output = "cde".
    }
}