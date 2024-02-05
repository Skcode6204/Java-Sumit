

import java.util.*;
public class Recursion9{
    public static int alternateSignSum(int n){
        //base case
        if(n == 0){
            return 0;
        }
        //recursive work
        int smallAns = alternateSignSum(n-1);

        //self work
        if(n%2 == 0){
            return smallAns - n;
        }else{
            return smallAns + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("required sum :"+alternateSignSum(n));
        
    }
}