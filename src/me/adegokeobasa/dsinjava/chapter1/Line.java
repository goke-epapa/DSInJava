package me.adegokeobasa.dsinjava.chapter1;

/**
 * Created by epapa on 12/01/2016.
 */
public interface Line {
    boolean contains(Point  point);
    boolean equals(Line line);
    boolean isHorizontal();
    boolean isVertical();
    double slope();
    String toString();
    double xIntercept();
    double yIntercept();
}
