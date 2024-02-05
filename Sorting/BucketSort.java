/* Bucket Sort :- 
ques :- Sort an array having numbers in range [0.0, 1.0] with uniform distance. efficient way to sort.
*/

import java.util.*;
public class BucketSort{
    public static void displayArray(float[] arr){
        for(int val = 0; val < arr.length; val++){
            System.out.println(arr[val]+" ");
        }
    }
    public static void bucketSort(float[] arr){
        int n = arr.length;
        //Buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        //create empty buckets.
        for(int i=0; i<n; i++){
            buckets[i] = new ArrayList<Float>();
        }

        //Add element to the bucket.
        for(int i=0; i<n; i++){
            int bucketIndex = (int) arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }

        //sort each bucket individually.
        for(int i=0; i<buckets.length; i++){
            Collections.sort(buckets[i]);
        }

        //merge all buckets to get final sorting.
        int index = 0;
        for(int i=0; i<buckets.length; i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j=0; j<currBucket.size(); j++){
                arr[index++] = currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] arr = {0.1f, 0.5f, 0.9f};
        System.out.println("array after sorting :");
        bucketSort(arr);
        displayArray(arr);
    }
}