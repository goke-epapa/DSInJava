package me.adegokeobasa.dsinjava.chapter1;

/**
 * Created by epapa on 12/01/2016.
 */
public interface Point {
    double amplitude();
    double distanceTo(Point point);
    boolean equals(Point point);
    double magnitude();
    String toString();
    double xCoordinate();
    double yCoordinate();
}