//solve the mathematical questions in java codes : (a*b)/(a+b)

import java.util.*;
public class variablesquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //upper half 
        //outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //lower part
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                //spaces
                int spaces = 2*(n-i);
                for(int j=1; j<=spaces; j++){
                    System.out.print(" ");

                }
                //2nd part
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
