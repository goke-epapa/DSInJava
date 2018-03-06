package me.adegokeobasa.dsinjava.codility.lessonfive;

/**
 * Created by epapa on 06/03/2018.
 */
public class CountDiv {
    public static void main(String[] args) {
        System.out.println(new CountDiv().solution(6, 11, 2));
    }
    public int solution(int A, int B, int K) {
        int aDiv = A / K;
        int bDiv = B / K;
        int result = bDiv - aDiv;
        if (A % K == 0) {
            result++;
        }
        return result;
    }
}
