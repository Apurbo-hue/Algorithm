package com.apurbo.university;

public class quickSort {

    public static int partition(int []arr,int low,int high){

        int i = low - 1;

        //taking the smaller value to the left of the pivot
        for ( int j = low ; j < high;j++){
            if(arr[j]<arr[high]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //taking the pivot into it's right place
        i++;
        int temp = arr[high];
        arr[high]= arr[i];
        arr[i] = temp;

        return i;
    }

    public static void quickSort(int []arr,int low,int high){

        if(low<high){
            int pivot = partition(arr,low,high);

            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public static void main(String[] args) {
        int arr[]={10,40,20,21,14};
        int n = arr.length;

        System.out.println("This is the unsorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        quickSort(arr,0,n-1);

        System.out.println("");
        System.out.println("This is the sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}