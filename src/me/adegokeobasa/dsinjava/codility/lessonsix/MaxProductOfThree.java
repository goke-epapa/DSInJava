package me.adegokeobasa.dsinjava.codility.lessonsix;

import java.util.Arrays;

/**
 * Created by epapa on 16/03/2018.
 */
public class MaxProductOfThree {

    public int solution(int[] A) {
        Arrays.sort(A);
        int productWithTwoNegatives = A[0] * A[1] * A[A.length - 1];

        int productWithPositivesOnly = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];

        if (productWithTwoNegatives > productWithPositivesOnly) {
            return productWithTwoNegatives;
        }
        return productWithPositivesOnly;
    }
}
