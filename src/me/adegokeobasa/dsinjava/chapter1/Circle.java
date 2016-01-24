package me.adegokeobasa.dsinjava.chapter1;

/**
 * Created by epapa on 12/01/2016.
 */
public interface Circle {
    double area();
    Point center();
    double circumference();
    boolean contains(Point point);
    boolean equals(Circle circle);
    double radius();
    String toString();
}
