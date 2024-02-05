//initialize a 2d array using java code and take input from user

import java.util.*;
public class TwoDArrays1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        
        //input 
        //rows
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){       //columns
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
