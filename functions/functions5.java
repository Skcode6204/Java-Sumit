

import java.util.*;
public class functions5{
    public static int GCD(int x, int y){
        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();

        System.out.println("required greatest common divisor is :"+GCD(x, y));
    }
}