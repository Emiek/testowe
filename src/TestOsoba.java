import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<>(2);
        grupa.add(new Osoba("Kowalski", LocalDate.of(2000, 1, 1)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2000, 1, 2)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(2000, 1, 3)));
        grupa.add(new Osoba("Wiśniewski", LocalDate.of(2000, 1, 4)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2000, 1, 5)));
        System.out.println("Nieposortowana grupa:");
        for (Osoba osoba : grupa) {
            System.out.println(osoba);
        }

        grupa.sort(null);

        System.out.println("Posortowana grupa:");
        for (Osoba osoba : grupa){
            System.out.println(osoba);
        }
    }

}
