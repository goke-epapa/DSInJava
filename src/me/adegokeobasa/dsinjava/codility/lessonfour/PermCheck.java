package me.adegokeobasa.dsinjava.codility.lessonfour;

/**
 * Created by epapa on 16/02/2018.
 */
public class PermCheck {

    public static void main(String[] args) {
        System.out.println(new PermCheck().solution(new int[]{3, 2, 1}));
    }

    public int solution(int[] A) {
        int xORCheck = 0;
        for (int i = 0; i < A.length; i++) {
            xORCheck ^= A[i];
            xORCheck ^= (i + 1);
        }
        return (xORCheck == 0) ? 1 : 0;
    }
}
