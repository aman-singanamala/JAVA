package POTD;

import java.util.*;


public class _10_may {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int tr = 0;
        int br = matrix.length - 1;
        int lc = 0;
        int rc = matrix[0].length - 1;

        while (tr <= br && lc <= rc) {
            for (int i = lc; i <= rc; i++) {
                ans.add(matrix[tr][i]);
            }
            tr++;
            for (int i = tr; i <= br; i++) {
                ans.add(matrix[i][rc]);
            }
            rc--;
            if (tr <= br) {
                for (int i = rc; i >= lc; i--) {
                    ans.add(matrix[br][i]);
                }
                br--;
            }

            if (lc <= rc) {
                for (int i = br; i >= tr; i--) {
                    ans.add(matrix[i][lc]);
                }
                lc++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4},
                {5,6,7,8,9},
                {10,11,12,13}};

        _10_may c= new _10_may();
        List<Integer> ans= c.spiralOrder(matrix);
        System.out.println(ans);
    }
}
