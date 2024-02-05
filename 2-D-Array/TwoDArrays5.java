//traverse the arrays and take size from user

import java.util.*;
public class TwoDArrays5{
    public static void main(String args[]){
        int[][] arr = {{23, 43, 67}, {76, 98, 54}, {12, 42, 87}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
        
       
    }
}