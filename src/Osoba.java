import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Comparable<Osoba>, Cloneable {
    public Osoba(String nazwisko, LocalDate dataU) {
        this.nazwisko = nazwisko;
        this.dataU = dataU;
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + nazwisko + " " + dataU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return nazwisko.equals(osoba.nazwisko) && dataU.equals(osoba.dataU);
    }

    @Override
    public Osoba clone() throws CloneNotSupportedException{
        Osoba cloned = (Osoba) super.clone();
        return cloned;
    }

    @Override
    public int compareTo(Osoba o) {
        if (nazwisko.equals(o.nazwisko)){
            return dataU.compareTo(o.dataU);
        }
        return nazwisko.compareTo(o.nazwisko);
    }

    private String nazwisko;
    private LocalDate dataU;


}
