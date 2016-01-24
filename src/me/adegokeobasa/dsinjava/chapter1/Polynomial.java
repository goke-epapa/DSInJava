package me.adegokeobasa.dsinjava.chapter1;

/**
 * Created by epapa on 12/01/2016.
 */
public interface Polynomial {
    int degree();
    Polynomial derivative();
    boolean equals(Point point);
    Polynomial sum(Polynomial polynomial);
    String toString();
    double valueAt(double point);
}
