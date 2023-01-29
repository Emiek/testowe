package PairDemo1;

public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> o){
        T tmp = o.getFirst();
        o.setFirst(o.getSecond());
        o.setSecond(tmp);
        return new Pair<T>(o.getFirst(),o.getSecond());
    }
}
