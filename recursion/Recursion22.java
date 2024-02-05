//PALINDROME STRING. :- LEVEL --> LEVEL;  ABCDCBA; TENET; etc are palindrome string.
//Method 1 --> wap to check the given string is palindrome or not.

import java.util.*;
public class Recursion22{
    public static String reverse(String s, int idx){
        //base case.
        if(idx == s.length()) return "";
        //recursion work.
        String smallAns = reverse(s, idx+1);
        //self work
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        //palindrome code.
        String rev = reverse(s, idx);

        if(rev.equals(s)){                  //in string we use this in place of if(rev == s).
            System.out.printf("%s is palindrome", s);
        }else{
            System.out.printf("%s is not palindrome", s);
        }
    }
}