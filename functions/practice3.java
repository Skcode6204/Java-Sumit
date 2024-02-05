//write a function whic take in 2 num and returns the greater of those two;

import java.util.*;
public  class practice3 {
    public static int getGreatest(int a, int b){
        if(a>b){
            return a;
            }
            else {
                return b;
            }
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("the greatest of two num is :"+getGreatest(a, b));
    }

    
}


