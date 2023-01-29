import java.lang.reflect.Array;
import java.util.*;

public class LinkedLlist {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Ania");
        a.add("Karol");
        a.add("Eryk");
        a.add("Dawid");
        a.add("Pawel");

        System.out.println(a);
        redukuj(a, 2);
        System.out.println(a);
        odwroc(a);
        System.out.println(a);

        ArrayList<String> b = new ArrayList<>();
        b.add("Ania");
        b.add("Karol");
        b.add("Eryk");
        b.add("Dawid");
        b.add("Pawel");

        zamC(b);
        System.out.println(b);
        print2(b);

    }

    public static void redukuj(LinkedList<String> pracownicy, int n) {
        ListIterator<String> pIter = pracownicy.listIterator();
        int licz = 1;
        while (pIter.hasNext()) {
            pIter.next();
            if (licz % n == 0) {
                pIter.remove();
            }
            licz++;
        }
    }
    public static <T> void redukuj2(LinkedList<T> pracownicy, int n) {
        ListIterator<T> pIter = pracownicy.listIterator();
        int licz = 1;
        while (pIter.hasNext()) {
            pIter.next();
            if (licz % n == 0) {
                pIter.remove();
            }
            licz++;
        }
    }

    public static void odwroc(LinkedList<String> lista){
        for (int i = 0, j = lista.size() -1; i < j ;i++){
            lista.add(i, lista.remove(j));
        }
    }
    public static <T> void odwroc2(LinkedList<T> lista){
        for (int i = 0, j = lista.size() -1; i < j ;i++){
            lista.add(i, lista.remove(j));
        }
    }

    public static void zamA(ArrayList<String> array){
        ListIterator<String> iter = array.listIterator();
        while(iter.hasNext()){
            String el = iter.next();
            iter.set(el.toUpperCase());
        }
    }
    public static void zamB(ArrayList<String> array){
        for (int i= 0; i < array.size();i++){
            array.set(i, array.get(i).toUpperCase());
        }
    }
    public static void zamC(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            Collections.replaceAll(array, array.get(i), array.get(i).toUpperCase());
        }
    }
    public static <E> void print(Iterable<E> cos){
        String napis = "";
        for(E x : cos){
            napis += x + ", ";
        }
        napis = napis.substring(0, napis.length()-2);
        System.out.print(napis);
    }
    public static <E> void print2(Iterable<E> iterable) {
        Iterator<E> iterator = iterable.iterator();
        if (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        while (iterator.hasNext()) {
            System.out.print(", " + iterator.next());
        }
    }

}
