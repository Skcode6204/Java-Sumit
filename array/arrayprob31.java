import java.util.*;
public class arrayprob31{
    public static int[] deleteInArray(int[] arr, int p){
        int n = arr.length;
        int[] arr2 = new int[n-1];
        for(int i=0; i<n-1; i++){
            if(i<p){
                arr2[i] = arr[i];
            }else if(i == p){
                continue;
            }else{
                arr2[i-1] = arr[i];
            }
        }
        return arr2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the "+n+" elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //System.out.println("enter the element you want to delete:");
        //int x = sc.nextInt();
        System.out.println("enter the index where you want to delete:");
        int p = sc.nextInt();

        arr = deleteInArray(arr, p);
        System.out.println("Array with is deleted from position "+p+" :"+Arrays.toString(arr));

    }
}