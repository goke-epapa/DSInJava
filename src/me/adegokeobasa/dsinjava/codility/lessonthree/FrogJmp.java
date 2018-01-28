package me.adegokeobasa.dsinjava.codility.lessonthree;

/**
 * Created by epapa on 28/01/2018.
 */
public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(10, 85, 30));
    }

    /**
     * Time Complexity - O(N)
     * @param X
     * @param Y
     * @param D
     * @return
     */
    public int solution(int X, int Y, int D) {
        int minimalSteps = (Y - X) / D;
        if((Y-X) % D > 0) {
            minimalSteps++;
        }
        return minimalSteps;
    }
}
