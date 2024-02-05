//print all Substring of the String.

import java.util.*;
public class String1{
    public static void main(String[] args) {
        String str = "abcde";
        for(int i=0; i<=4; i++){
            for(int j=i+1; j<=5; j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}