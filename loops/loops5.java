//print all n number of even number taken from user

import java.util.*;
public class loops5 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;

        for(i=1; i<=n; i++) {
            if(i % 2 == 0){
                System.out.println(i+"");
            }
            
        }
        
    }
}