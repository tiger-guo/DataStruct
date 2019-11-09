package Backtracking;

import java.sql.SQLOutput;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 八皇后问题
 * @date: 2019/11/7
 */
public class EightQueens {

    int[] resunlt = new int[8];

    public void solution(int row) {
        if (row == 8) {
            print(resunlt);
            return;
        }
        for (int i = 0; i < 8; i++) {
            if (isOk(row, i)) {
                resunlt[row] = i;
                solution(row + 1);
            }
        }
    }

    private boolean isOk(int row, int col) {
        int leftup = col - 1, rightup = col + 1;
        for (int i = row - 1; i >= 0; i--, leftup--, rightup--) {
            if (resunlt[i] == col)
                return false;
            if (leftup >= 0) {
                if (resunlt[i] == leftup)
                    return false;
            }
            if (rightup < 8) {
                if (resunlt[i] == rightup)
                    return false;
            }
        }
        return true;
    }

    private void print(int[] resunlt) {
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if(resunlt[i] == j)
                    System.out.print("Q ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
