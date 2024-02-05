

import java.util.*;
public class Recursion11{
    public static int LCM(int a, int b, int res){
       res = res + b;
       if(res % a == 0 && res % b == 0){
        return res;
       }

       //recursive work & self work
       return LCM(a, b, res);
    }
   
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        //System.out.println("enter res :");
        //int res = sc.nextInt();

        System.out.println("required lcm :"+LCM(a, b, res));
    }
}