import java.util.ArrayList;

public class ArrayListDop {
    public static void main(String[] args){
        ArrayList<Integer> tab = new ArrayList<>();
        ArrayList<Number> tab2 = new ArrayList<>();
        tab.add(0);
        tab.add(1);
        tab2.add(2);
        tab2.add(3);
        dopasowanie.dop(tab2,tab);
        System.out.println(tab2);
        dopasowanie.dop2(tab,tab2);
        System.out.println(tab2);

    }
}

class dopasowanie{
    public static <E> void dop(ArrayList<E> tab, ArrayList<? extends E> dopis){
        tab.addAll(dopis);
    }
    public static  <E> void dop2(ArrayList<E> dopis, ArrayList<? super E> tab){
        tab.addAll(dopis);
    }
}