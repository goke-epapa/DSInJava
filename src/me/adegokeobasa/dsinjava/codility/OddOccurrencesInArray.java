package me.adegokeobasa.dsinjava.codility;

/**
 * Created by epapa on 27/01/2018.
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        System.out.println(new OddOccurrencesInArray().solution(new int[]{1, 2, 2, 4, 4, 1, 9}));
    }

    public int solution(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;
    }
}
