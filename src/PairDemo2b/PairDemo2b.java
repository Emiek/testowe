package PairDemo2b;

import java.util.*;
import java.text.SimpleDateFormat;

public class PairDemo2b
{
    public static void main(String[] args)
    {
        GregorianCalendar[] birthdays = {
            new GregorianCalendar(1906, Calendar.DECEMBER, 9),  // G. Hopper
            new GregorianCalendar(1815, Calendar.DECEMBER, 10),  // A. Lovelace
            new GregorianCalendar(1903, Calendar.DECEMBER, 3),  // J. von Neumann
            new GregorianCalendar(1910, Calendar.JUNE, 22),  // K. Zuse
        };
        Pair<GregorianCalendar> mm = ArrayAlgT.minmax(birthdays);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("min = " + sdf.format(mm.getFirst().getTime()));
        System.out.println("max = " + sdf.format(mm.getSecond().getTime()));
    }
}

class ArrayAlg
{
    public static <T extends Comparable<? super T>> Pair<T> minmax(T[] a)
    {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair<T> (min, max);
    }
}

