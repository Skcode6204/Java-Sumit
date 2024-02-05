//write a function that takes radius as input and return the circumference of circle

import java.util.*;
public class practice4 {
    public static double getCircumference(double radius){
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        System.out.println("the circumference of circle is :"+getCircumference(radius));

    }
}