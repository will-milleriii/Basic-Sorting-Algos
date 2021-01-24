package QuickSort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args){
        int[] input = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
        quickSort(input, 0, input.length - 1);

        System.out.println(Arrays.toString(input));

    }

    public static void quickSort(int[] inputArray, int start, int end){
        if (start < end){
            int q = partition(inputArray, start, end);
            quickSort(inputArray, start, q - 1); //sorts left half
            quickSort(inputArray, q + 1, end); //sorts right half
        }
    }

    public static int partition(int[] inputArray, int start, int end){
        int x = inputArray[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++){
            if (inputArray[j] <= x){
                i++;
                int valueI = inputArray[i];
                int valueJ = inputArray[j];
                inputArray[i] = valueJ;
                inputArray[j] = valueI;
            }
        }
        //put pivot value in proper slot next
        int valueI = inputArray[i + 1];
        inputArray[end] = valueI;
        inputArray[i+1] = x;
        return i + 1;
    }
}
