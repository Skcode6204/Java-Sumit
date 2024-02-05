// Intering and New.

import java.util.*;
public class String2{
    public static void main(String[] args) {
        String s = "Hello";
        String x = "Hello";
        x = "Mello";
        System.out.println(s);
        System.out.println(x);

        //Immutability of String.

        //Hello to Dello.
        s = s.substring(0, 2)+ 'y' + s.substring(3);
        System.out.println(s);

        //perfromance of Immutability.
        String str = "";
        for(int i=1; i<=10; i++){
            str = str + i;      // "1", "12", "123",....., "12345678910".
        }
        System.out.println(str);

        // str.equals() and == ;

        String s1 = "hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);                //return false
        System.out.println(s1 == s3);               // return false
        System.out.println(s2.equals(s3));          // return true
        System.out.println(s3.equals(s1));          // return true

    }
}