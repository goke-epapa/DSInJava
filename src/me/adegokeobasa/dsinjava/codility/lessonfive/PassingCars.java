package me.adegokeobasa.dsinjava.codility.lessonfive;

/**
 * Created by epapa on 07/03/2018.
 */
public class PassingCars {

    public static void main(String[] args) {
        System.out.println(new PassingCars().solution(new int[]{0, 1, 0, 1, 1}));
        System.out.println(new PassingCars().solution(new int[]{0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1}));
    }

    public int solution(int[] A) {
        int result = 0;
        int carFactor = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                carFactor++;
            } else {
                result += carFactor;
            }
            if (result > 1000000000) {
                return -1;
            }
        }

        return result;
    }
}
