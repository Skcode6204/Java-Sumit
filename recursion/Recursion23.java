//PALINDROME STRING. :- LEVEL --> LEVEL;  ABCDCBA; TENET; etc are palindrome string.
//Method 2 --> wap to check the given string is palindrome or not.

import java.util.*;
public class Recursion23{
    public static boolean isPalindrome(String s, int l, int r){
        //base case.
        if (l >= r) return true;

        //recursive and self work.
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        int l = 0;
        int r = s.length()-1;


        //function call
        System.out.println("Given string is palindrome : "+isPalindrome(s, l, r));
        


    }
}