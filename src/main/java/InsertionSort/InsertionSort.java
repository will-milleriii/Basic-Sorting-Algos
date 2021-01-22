package InsertionSort;

public class InsertionSort {

    public static void main(String[] args){
        int[] myArray = insertionSort(new int[] {9, 8, 99, 110, 8, 87, 637, 8, 3, 13, 87, 12, 99});
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }


    //TODO Insertion Sort Practice
    // Input: an array to be sorted
    // Output: a sorted array in ascending order
    public static int[] insertionSort(int[] arr){
        //for i = 1 to arr.length - 1
        for (int i = 1; i < arr.length; i++){
            //set element to arr[i] and set j to i - 1
            int element = arr[i]; //element variable contains the data we intend on bringing over to the sorted area of array
            int j = i - 1; //points to the index position of the last value in the sorted area of the array
            // while j >= 0 && arr[j] > element
            while (j >= 0 && arr[j] > element){
                // set arr[j+1] to arr[j]
                arr[j+1] = arr[j];
                // decrement j by 1
                j--;
            }
            //set arr[j+1] to element
            arr[j+1] = element;
        }
        return arr;
    }
}
