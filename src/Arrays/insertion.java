package Arrays;
import java.util.*;
public class insertion {
    static int[] insert(int[] array, int element, int position){
        int n= array.length;

        int[] a= new int[n+1];

        for(int i=0;i<position;i++){
            a[i]=array[i];
        }
        a[position]=element;

        for(int i=position;i<n;i++){
            a[i+1]= array[i];
        }
        return a;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 10;
        int position = 2;

        int[] newArr = insert(arr, element, position);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Element " + element + " inserted at position " + position);
        System.out.println("Modified Array: " + Arrays.toString(newArr));

    }

}
