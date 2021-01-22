package SelectionSort;

public class SelectionSort {

    public static void main(String[] args){
        int[] myArray = selectionSort(new int[] {9, 8, 3, 13, 87, 12, 99});
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }

    // TODO Selection Sort
    // Input: an array to be sorted
    // Output: array sorted in ascending order


    public static int [] selectionSort(int[] arr){
        //for i = 0 to Arr.length - 1
        for (int i = 0; i < arr.length-1; i++){
            // Set minimum to i
            int min = i;
            // for j = i + 1 to A.length
            for (int j = i + 1; j < arr.length; j++){
                //if Arr[j] < Arr[min]
                if (arr[j] < arr[min]){
                    // then set min to j
                    min = j;
                }
            }
            //swap Arr[i] with Arr[min]
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
                return arr;
    }
}
