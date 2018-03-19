package me.adegokeobasa.dsinjava.misc;

import java.util.DoubleSummaryStatistics;

/**
 * Created by epapa on 19/03/2018.
 */
public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        System.out.println(new FactorialTrailingZeroes().trailingZeros(1000));
    }

    public int trailingZeros(int n) {
        int trailingZeros = 0;
        int power = 0;

        while (true) {
            int div = n / (int) Math.pow(5, ++power);
            if(div < 1) {
                break;
            }
            trailingZeros += div;
        }
        return trailingZeros;
    }
}
