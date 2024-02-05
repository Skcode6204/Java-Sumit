//write a java code to find sum of n natural number

import java.util.*;
public class loops3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i;
        for(i=0; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}