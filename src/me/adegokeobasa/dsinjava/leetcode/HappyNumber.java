package me.adegokeobasa.dsinjava.leetcode;

/**
 * Created by epapa on 31/01/2016.
 */
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }

    public boolean isHappy(int n) {
        if(n == 1) return true;
        int[] array =  new int[810]; // biggest number you can ever get from the sum of squares of digits
        int sum = 0;
        while(n != 1) {
            sum=0;
            while(n>0){
                sum+=(n%10)*(n%10);
                n=n/10;
            }

            if(sum == 1) {
                return true;
            }
            array[sum]++;

            if(array[sum] > 1) {
                return false;
            }
            n = sum;
        }
        return true;
    }
}
