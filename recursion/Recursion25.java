//print all subsequences.

import java.util.*;
public class Recursion25{
    public static void printSubsequence(String s, String currAns){   // s = "abc", currAns = ""
        //base case.
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }

        //recursion work & self work
        char currChar = s.charAt(0);
        String remString = s.substring(1);
        printSubsequence(remString, currAns + currChar);
        printSubsequence(remString, currAns);
    }

    public static void main(String[] args) {
        printSubsequence("abc", "");
    }
}