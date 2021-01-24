package MergeSort;

public class MergeSort {

    public static void main(String[] args){
        int[] input = new int[] {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        Sorting sorting = new Sorting();
        Sorting.sort(input);

        for (int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }
}
