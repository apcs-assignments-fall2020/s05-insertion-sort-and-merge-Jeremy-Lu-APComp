import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList <String> output_array = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++){
            
        }
        return null;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) {
    /*
        int[] combined = new int[arr1.length + arr2.length];
        int arraypos = 0;
        int arraypos_2 = 0;
        int mergedpos = 0;
    while(arraypos < arr1.length && arraypos_2 < arr2.length) {
        if (arr1[arraypos] < arr2[arraypos_2]) {
            combined[mergedpos+=1] = arr1[arraypos+=1];
        } 
        else {
            combined[mergedpos+=1] = arr2[arraypos_2+=1];
        }
    }
    while (arraypos < arr1.length) {
            combined[mergedpos+=1] = arr1[arraypos+=1];
        }
    while (arraypos_2 < arr2.length) {
            combined[mergedpos+=1] = arr2[arraypos_2+=1];
        }
    return combined;
    */
    int[] output_array = new int[arr1.length + arr2.length];
    int length = arr1.length;
    for (i = 0; i < length; i++){
        int var_1 = arr1[i];
        int var_2 = arr2[i];
        if(var_1>var_2){
            output_array[i] = var_2;
        }
        else if(var_2>var_1){
            output_array[i] = var_1;
        }
    }
}

    public static void main(String[] args) {
        int[] one = { 3, 7, 10 };
        int[] two = { 4, 8, 11 };
        System.out.println(merge(one, two));
    }
}
