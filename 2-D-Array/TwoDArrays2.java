//take a input from user and make an 2d array and search fro given number x and print the indices

import java.util.*;
public class TwoDArrays2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt(); 

        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                //compare with x
                if(numbers[i][j] == x){
                    System.out.println("x found at index (" + i + " " + j + ")");
                }
               
            }
            
        }

    }
}
