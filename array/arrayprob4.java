//cloning of array
import java.util.*;
public class arrayprob4{
    public static void main(String[] args){
        int originalArray[];
        int cloneArray[];
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        size = sc.nextInt();
        originalArray = new int[size];
        cloneArray = new int[size];
        System.out.println("enter the elements of original array");

        for(int i=0; i<size; i++){
            originalArray[i] = sc.nextInt();

        }
        for(int i=0; i<originalArray.length; i++){
            cloneArray[i] = originalArray[i];
        }
        System.out.println("elements of original array");

        for(int i=0; i<originalArray.length; i++){
            System.out.print(originalArray+ " ");
        }
        System.out.println("\nelements of cloned array");

        for(int i=0; i<cloneArray.length; i++){
            System.out.print(cloneArray[i]+ " ");
        }
    }
}