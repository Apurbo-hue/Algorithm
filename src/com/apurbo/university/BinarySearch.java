package com.apurbo.university;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {99, 11, 75, 101, 127, 5, 89, 23, 58, 102};
        Arrays.sort(arr);

        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(reversed));

        int low = 0;
        int high = arr.length - 1;
        int key = 102;

        while(low<=high){
            int mid = (low+high)/2;
            if(reversed[mid]==key){
                System.out.println("Element found at the index "+mid);
                break;
            }
            else if(key<reversed[mid]){
                low = mid+1;
            }
            else if(key>reversed[mid]){
                high = mid - 1;
            }
            else{
                System.out.println("key not found");
            }
        }
    }
}
