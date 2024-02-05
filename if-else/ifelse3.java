// write a java code and take input from user and check the conditions: (a=b, equal); (a>b, a is greater); (a<b, a is lesser)

import java.util.*;

public class ifelse3 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //conditions
        if(a == b) {
            System.out.println("equal");
        } else if(a > b){
            System.out.println("a is greater");
        } else {
            System.out.println("a is lesser");
        }

    }
}