//wap to reverse the string using recursion.

import java.util.*;
public class Recursion21{
    public static String reverse(String s, int idx){
        //base case
        if(idx == s.length()) return"";

        //recursion work.
        String smallAns = reverse(s, idx+1);

        //self work.
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        System.out.println("required reverse of string : "+reverse(s, idx));      //function call
    }
}