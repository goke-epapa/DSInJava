package me.adegokeobasa.dsinjava.codility.lessonthree;

/**
 * Created by epapa on 28/01/2018.
 */
public class PermMissingElem {

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[] {2, 3, 1, 4}));
    }

    public int solution(int[] A) {
        int totalXor = 0;
        for (int i = 1; i <= A.length + 1; i++) {
            totalXor ^= i;
        }

        int missingTotalXor = 0;
        for (int i = 0; i < A.length; i++) {
            missingTotalXor ^= A[i];
        }

        return totalXor ^ missingTotalXor;
    }
}
