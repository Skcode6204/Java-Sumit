//Recursion on String.
//Basics of String.

import java.util.*;
public class Recursion19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(s);

        // in array 1, 2, 3, 4. arr[0] = 1.
        char ch = s.charAt(0);   //it print the first index or letter of string.
        //in String "s.charAt(0)" - print the first index
        //SUMIT
        //01234
        System.out.println(ch);

        //print all indices of string.
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

        //partition of string.
        System.out.println(s.substring(2, 4));  //where in (2, 4) 2 is included & 4 is excluded.
        //we can write above line as
        System.out.println(s.substring(1));  //here it print the all string from given index to length of string.


    }
}

