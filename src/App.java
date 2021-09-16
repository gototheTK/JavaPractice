import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.lang.*;

public class App {

    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    // QuickSort
    private static void quickSort(int[] arr, int start, int end){

        int part2 = partition(arr, start, end);

       
        if(start < part2 - 1){
            quickSort(arr, start, part2-1);
        }

        if(part2 < end){
            quickSort(arr, part2, end);
        }
    
    }
    
    // Partitioning
    private static int partition(int[] arr, int start, int end){

        int pivot = arr[(start + end) / 2];

        while(start <= end){

            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;

            if(start<=end){
                swap(arr, start, end);
                start++;
                end--;
            }

        }

        return start;

    }

    // swap
    private static void swap(int[] arr, int start, int end){

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }





    public static void main(String[] args) throws Exception {
        

        int[] numbers = {868, 868, 86, 867 ,863 ,865,866, 323, 8, 33, 44,85,853,856};




        for(int number : numbers){
            System.out.print(number + " ");
        }

        System.out.println();
        quickSort(numbers);

        for(int number : numbers){
            System.out.print(number + " ");
        }

        System.out.println("854".compareTo("85"));

        

    }
}
