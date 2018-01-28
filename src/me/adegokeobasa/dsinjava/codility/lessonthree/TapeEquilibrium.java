package me.adegokeobasa.dsinjava.codility.lessonthree;

/**
 * Created by epapa on 28/01/2018.
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{-1000, 1000}));
    }

    public int solution(int[] A) {
        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }

        // Calculate Sum
        int rightSum = 0;
        for (int i = 0; i < A.length; i++) {
            rightSum += A[i];
        }

        // Check Difference
        int leftSum = 0;
        int minimalDifference = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            int difference = Math.abs(leftSum - rightSum);
            if (minimalDifference > difference) {
                minimalDifference = difference;
            }
        }

        return minimalDifference;
    }
}
