package SORT;

class Sortings {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void bubblesort(int[] arr){
        int n= arr.length;
        boolean swapped;
        int count=0;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for (int j =i+1 ; j < n-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp= arr[j];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                    count++;
                }

            }
            if(!swapped){
                break;
            }
        }
    }

    static void selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            int temp= arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    static int[] mergeSort(int[] arr){
        int n= arr.length;

        if(n<=1){
            return arr;
        }
        int mid=n/2;
        int[] left= new int[mid];
        int[] right= new int[n-mid];
        for(int i=0;i<mid;i++){
            left[i]= arr[i];
        }
        for(int i= mid;i<n;i++){
            right[i-mid]= arr[i];
        }

        left=mergeSort(left);
        right=mergeSort(right);

        return merger(left, right);
    }

    static int[] merger(int[] A, int[] B){
        if(A==null){
            return B;
        }
        if(B==null){
            return A;
        }

        int[] ans= new int[A.length+ B.length];
        int i=0, j=0, k=0;
        while(i< A.length && j< B.length){
            if(A[i]<=B[i]){
                ans[k++]=A[i++];
            }else {
                ans[k++]=B[j++];
            }
        }

        while(i<A.length){
            ans[k++]= A[i++];
        }
        while(j<B.length){
            ans[k++]=B[j++];
        }

        return ans;
    }

}

public class Main {
    public static void main(String[] args) {
        Sortings obj = new Sortings();
        int[] a = {1, 4, 6, 3, -9, -55};
        //obj.bubbleSort(a);
        //Sortings.selectionsort(a);
        int[] ans = Sortings.mergeSort(a);

        // Printing the sorted array
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
