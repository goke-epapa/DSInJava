package me.adegokeobasa.dsinjava.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by epapa on 30/01/2016.
 */
public class PascalTriangle2 {

    public static void main(String[] args) {
        System.out.println(new PascalTriangle2().getRow(0));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            if(i == 0) {
                row.add(1);
                continue;
            }

            row = getTriangleRow(row);
        }

        return row;
    }

    public List<Integer> getTriangleRow(List<Integer> previousRow) {
        List<Integer> row = new ArrayList<>();

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
