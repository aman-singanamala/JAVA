package Arrays;

public class linear_Search {
    static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,5,33,22,111,6};
        int target=6;
        int ans= search(a, target);
        if(ans==-1)
            System.out.println("ELEMENT NOT FOUND");
        else System.out.println("ELEMENT FOUND AT "+ans+" INDEX");

    }
}


