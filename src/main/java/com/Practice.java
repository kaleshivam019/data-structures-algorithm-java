package com;

import java.util.Arrays;

public class Practice {
    public static int[] array = {11, 2, 10, 12, 1, 0, 4, 6, 3};

    public static void main(String[] args){

        /*Practice.bubbleSort(array, array.length);*/

        /*Practice.selectionSort(array, array.length);*/

        Practice.insertionSort(array, array.length);


    }

    /**
     * InsertionSort
     * @param array
     * @param n
     */
    private static void insertionSort(int[] array, int n) {
        System.out.println("Before Insertion Sort");
        Arrays.stream(array).forEach(value -> System.out.print(value + " "));

        for (int i = 1;i<n;i++){
            int temp = array[i];
            int j = i-1;
            while (j>=0){
                if(array[j] > temp){
                    array[j+1] = array[j];
                }else if(array[j] < temp){
                    break;
                }
                j--;
            }
            array[j+1] = temp;
        }

        System.out.println("After Insertion Sort");
        Arrays.stream(array).forEach(value -> System.out.print(value + " "));
    }

    /**
     * SelectionSort
     * @param array
     * @param n
     */
    private static void selectionSort(int[] array, int n) {
        System.out.println("Before Selection Sort");
        Arrays.stream(array).forEach(value -> System.out.print(value + " "));

        for(int i=0;i<n;i++){
            int sortedElement = i;
            for (int j=i+1;j<n;j++){
                if(array[j] < array[sortedElement]){
                    int temp = array[sortedElement];
                    array[sortedElement] = array[j];
                    array[j] = temp;
                }
            }

        }

        System.out.println("After Selection Sort");
        Arrays.stream(array).forEach(value -> System.out.print(value + " "));
    }

    private static void bubbleSort(int[] array, int n) {

        System.out.println("Before Bubble Sort");
        Arrays.stream(array).forEach(value -> System.out.print(value + " "));

        for(int i=1;i<n;i++){
            for(int j=0;j<n-1;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("After Bubble Sort");
        Arrays.stream(array).forEach(value -> System.out.print(value + " "));
    }
}
