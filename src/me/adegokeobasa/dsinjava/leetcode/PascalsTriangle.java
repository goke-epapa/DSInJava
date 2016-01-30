package me.adegokeobasa.dsinjava.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by epapa on 30/01/2016.
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangle().generate(10));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            pascalTriangle.add(getTriangleRow(pascalTriangle, i));
        }
        return pascalTriangle;
    }

    public List<Integer> getTriangleRow(List<List<Integer>> triangle, int rowNumber) {
        List<Integer> row = new ArrayList<>();
        int previousIndex = rowNumber - 1;
        if(previousIndex == -1) {
            row.add(1);
            return row;
        }

        List<Integer> previousRow = triangle.get(previousIndex);

        // New row will have 1 more element, hence the +1
        int firstElement = -1;
        int secondElement = 0;
        for(int i = 0; i < previousRow.size() + 1; i++) {
            int newElement = firstElement == -1 ? previousRow.get(secondElement) : secondElement == previousRow.size() ? previousRow.get(firstElement) : previousRow.get(firstElement) + previousRow.get(secondElement);
            firstElement++;
            secondElement++;
            row.add(newElement);
        }
        return row;
    }
}
