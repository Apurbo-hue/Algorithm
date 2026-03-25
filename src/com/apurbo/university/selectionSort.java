package com.apurbo.university;

public class selectionSort {
    public static void main(String[] args) {
        int arr []= {10,21,32,14,26};

        for (int i = 0; i < arr.length-1; i++) {
            int smallestIndx = 0;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallestIndx]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[smallestIndx];
                    arr[smallestIndx]=temp;
                    smallestIndx++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
