package Arrays;
import java.util.Arrays;
public class deletion {
    static int[] deleteElement(int[] array, int position){
        int[] a= new int[array.length-1];

        for(int i=0;i<position;i++){
            a[i]=array[i];
        }
        for(int i= position+1;i<array.length;i++){
            a[i-1]= array[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;

        int[] newArr = deleteElement(arr, index);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Element at index " + index + " deleted");
        System.out.println("Modified Array: " + Arrays.toString(newArr));
    }
}
