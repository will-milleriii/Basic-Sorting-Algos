package BubbleSort;

public class BubbleSort {

    public static void main(String[] args){

    }

    public static int[] nestLoopSol(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] whileLoopSol(int[] arr){
        if (arr.length == 0){
            return new int[] {};
        }
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++){
                if(arr[i] < arr[i + 1]){
                    swap(i, i+1, arr);
                }
            }
            counter++;
        }
        return arr;
    }

    public static void swap(int i, int j, int[] array){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

