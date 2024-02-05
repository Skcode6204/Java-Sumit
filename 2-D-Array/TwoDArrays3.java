//initialize in 2d arrays usings function

public class TwoDArrays3 {
    public static void multiArrays(String args[]) {
        int[][] arr = {{56, 76, 97}, {23, 45, 76}, {12, 34, 99}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[1][3]);

        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
        System.out.println(arr[2][3]);

    }

    public static void main(String args[]){
        TwoDArrays3 obj = new TwoDArrays3();
        obj.multiarrays();
    }

    
}
        