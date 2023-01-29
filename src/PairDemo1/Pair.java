package PairDemo1;

public class Pair<T>
{
    public Pair()
    {
        first = null;
        second = null;
    }

    public Pair(T first, T second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst()
    {
        return first;
    }

    public T getSecond()
    {
        return second;
    }

    public void setFirst(T newValue)
    {
        first = newValue;
    }
    
    public void setSecond(T newValue)
    {
        second = newValue;
    }

    public void swap(){
        T tmp = first;
        first = second;
        second = tmp;
    }

    private T first;
    private T second;
}

