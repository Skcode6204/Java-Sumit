/*Given a String containing digits from 2-9 inclusive, return all possible letter combinations that the number
could represent. return the answer in any order.
Input = digits :- "23"
Output = ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
*/

import java.util.*;
public class Recursion28{
    public static void Combination(String dig, String[] kp, String res){
        if(dig.length() == 0){
            System.out.print(res+" ");
            return;
        }

        //recursion & Self work.
        int currNum = dig.charAt(0) - '0';   //rule of converting string into integer i.e; int = string - 0;
        String currChoices = kp[currNum];
        for(int i=0; i<currChoices.length(); i++){
            Combination(dig.substring(1), kp, res+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig = "253";
        //kp[7] = "pqrs"
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        Combination(dig, kp, "");
    }
}