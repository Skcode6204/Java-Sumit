//write a function that take in age as input and return if that person is eligible to vote or not

import java.util.*;
public class practice5 {
    public static boolean isEligible(int age) {
        if(age>18){
            return true;
        } else{
            return false;
        }
}

    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            System.out.println(isEligible(age));

        }    
} 