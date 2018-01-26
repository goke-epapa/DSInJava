package me.adegokeobasa.dsinjava.cotty;

import java.util.Arrays;

/**
 * Created by epapa on 26/01/2018.
 */
public class ReverseArray {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        reverse(array);
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int k = array.length - i - 1;
            array[k] = array[i] ^ array[k];
            array[i] = array[i] ^ array[k];
            array[k] = array[i] ^ array[k];
        }
        System.out.println(Arrays.toString(array));
    }
}
