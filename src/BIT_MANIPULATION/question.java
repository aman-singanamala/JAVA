package BIT_MANIPULATION;

import java.util.Arrays;

public class question  {
    public static int xor_1_n(int n){
        //   n     xor
        //   1    1
        //   2    3
        //   3    0
        //   4    4
        //   5    1
        //   6    7
        //   7    0
        //   8    8

        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;
        }
        if (n % 4 == 3) {
            return 0;
        }
        return -1;
    }

    public static void xor_l_r(int l , int r){
        int ans= xor_1_n(r)^ xor_1_n(l-1);
        System.out.println(ans);
    }


    public static void calculate(String[] words){
        int[] bitmasks= new int[words.length];
        for(int i=0;i<words.length;i++){
            bitmasks[i]= calculateBitMask(words[i]);
        }

        System.out.println(Arrays.toString(bitmasks));
    }

    public int maxProduct(String[] words) {
        int[] masks = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            masks[i] = calculateBitMask(words[i]);
        }

        int maximum = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    maximum = Math.max(words[i].length() * words[j].length(), maximum);
                }
            }
        }

        return maximum;
    }

    public static int calculateBitMask(String word) {
        int bitmask = 0;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            bitmask |= (1 << index);
        }
        return bitmask;
    }



}
