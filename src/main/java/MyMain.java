import java.util.ArrayList;
import java.util.Arrays;
public class MyMain {
    /*
    Create a new ArrayList (this will be the sorted output list)
    Loop through the original list:
    Get the next element that you are inserting
    Find the index that this element should be inserted at (you can find this by looping through the output list; 
    the element should be inserted before the first number in the output list that is larger than it)
    Insert the element at this index
    Return the output list
    */
    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList <Integer> output_array = new ArrayList<Integer>();
        int i, j;
        i = j = 0;
        while(i < list.size() && j < output_array.size()){
            int next_element = list.get(i+1);
            int outputarray_index = output_array.get(j);
            if(next_element<outputarray_index){
                break;
            }
            else if(next_element<outputarray_index){
                output_array.add(j, next_element);
            }
            else{
                output_array.add(j, next_element);
            }
        }
        return output_array;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) {
    int[] output_array = new int[arr1.length + arr2.length];
    int length_1 = arr1.length;
    int length_2 = arr2.length;
    int i, j;
    i = j = 0;
    while(i < length_1 && j < length_2){
    int var_1 = arr1[i];
    int var_2 = arr2[j];
    if(var_1>var_2){
        output_array[i+j] = var_2;
        j++;
    }
    else if(var_2>var_1){
        output_array[i+j] = var_1;
        i++;
    }
}
    while(i<length_1){
        int var_1 = arr1[i];
        output_array[i+j] = var_1;
        i++;
    }
    while(j<length_2){
        int var_2 = arr2[j];
        output_array[i+j] = var_2;
        j++;
    }
    return output_array;
}

    public static void main(String[] args) {
        int[] one = { 3, 7, 10 };
        int[] two = { 4, 8, 11 };
        ArrayList <Integer> sample_array = new ArrayList<Integer>();
        sample_array.add(2);
        sample_array.add(5);
        sample_array.add(1);
        sample_array.add(11);
        sample_array.add(3);
        System.out.println(Arrays.toString(merge(one, two)));
        System.out.println(insertionSort(sample_array));
    }
}
