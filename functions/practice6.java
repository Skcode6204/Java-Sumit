//write a program to enter thye nu8mbers till the users want and the end it should display the count of postive , negative and zeroes entered

import java.util.*;
public class practice6 {
    public static void main(String args[]) {
        int positive = 0, negative = 0, zeros = 0;
        System.out.println("press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(input == 1) {
            System.out.println("enter your number :");
            int number = sc.nextInt();
            if(number>0){
                positive++;
            } else if(number<0){
                negative++;
            } else{
                zeros++;
            }
            System.out.println("press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positive :"+positive);
        System.out.println("Negative :"+negative);
        System.out.println("Zeros :"+zeros);
    }
}