// Return the palindrome as well as no. of palindrome of the given String.

import java.util.*;
public class string5{
    public static boolean isPalindrome(String s){
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while(i<j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abcba";
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                if(isPalindrome(str.substring(i, j)) == true){
                    System.out.println(str.substring(i, j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\n The No. of palindromic substring are : "+count);
    }
}