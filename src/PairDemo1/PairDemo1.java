package PairDemo1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class PairDemo1 {
    public static void main(String[] args) {
        String[] words = {"Ala", "ma", "psa", "i", "kota"};
        // Pair<String> mm = ArrayAlg.<String>minmax(words);
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        mm.swap();
        System.out.println(mm.getFirst() + mm.getSecond());
        Pair<String> mm_swap = PairUtil.swap(mm);
        System.out.println(mm_swap.getFirst() + mm_swap.getSecond());
        Integer[] intArray = {1, 2, 3, 4, 5};
        LocalDate[] dateArray = {LocalDate.of(2000, 1, 1), LocalDate.of(2010, 1, 1), LocalDate.of(2020, 1, 1)};

        System.out.println(ArrayUtil.isSorted(intArray)); // true
        System.out.println(ArrayUtil.isSorted(dateArray)); // true

        intArray = new Integer[]{5, 4, 3, 2, 1};
        dateArray = new LocalDate[]{LocalDate.of(2020, 1, 1), LocalDate.of(2010, 1, 1), LocalDate.of(2000, 1, 1)};

        System.out.println(ArrayUtil.isSorted(intArray)); // false
        System.out.println(ArrayUtil.isSorted(dateArray)); // false

        System.out.println(ArrayUtil.binSearch(intArray, 3));

        Integer[] a = {2, 5, 3, 0, 7, 1};
        ArrayUtil.selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}

class ArrayAlg {

    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }

            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new Pair<String>(min, max);
    }
}

class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].compareTo(a[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] array, T o) {
        int pocz = 0;
        int kon = array.length - 1;
        while (pocz <= kon) {
            int sr = (pocz + kon) / 2;
            if (array[sr].compareTo(o) == 0) {
                return sr;
            } else if (array[sr].compareTo(o) < 0) {
                pocz++;
            } else {
                kon--;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int first =  i;
            for (int j = i + 1; j < array.length; j++){
                if(array[j].compareTo(array[first]) < 0){
                    first = j;
                }
            }
            T tmp = array[i];
            array[i] = array[first];
            array[first] = tmp;

        }
    }

}

