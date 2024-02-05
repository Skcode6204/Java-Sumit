//remove all the occurence of given character let suppose "a" in given string s = "abcax"

import java.util.*;
public class Recursion20{
    public static String removeOccurence(String s, int idx){
        //base case.
        if (idx == s.length())  return "";

        //recursion work.
        String smallAns = removeOccurence(s, idx+1);

        //self work
        char currChar = s.charAt(idx);
        if(currChar != 'a'){
            return smallAns + currChar;
        } else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        System.out.println(removeOccurence(s, idx));
        
    }
}