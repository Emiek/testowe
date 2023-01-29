import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lines {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.err.println("Sposób użycia: java FileScannerDemo nazwaPliku");
            System.exit(1);
        }
        Scanner file;
        List<String> lines = new ArrayList<>();
        file = new Scanner(new File(args[0]));
        try {
            while (file.hasNextLine()) {
                lines.add(file.nextLine());
            }
            String[] linie = lines.toArray(new String[0]);
            System.out.println("Przed");
            System.out.println(lines);
            Collections.sort(lines);
            System.out.println("Po");
            System.out.println(lines);
            lines.sort(Comparator.comparingInt(String::length));
            System.out.println("Lista po sortowaniu od najkrótszych do najdłuższych linii:");
            System.out.println(lines);

            Arrays.sort(linie);
            System.out.println("Tablica po sortowaniu naturalnym:");
            System.out.println(Arrays.toString(linie));

            Arrays.sort(linie, Comparator.comparingInt(String::length));
            System.out.println("Tablica po sortowaniu od najkrótszych do najdłuższych linii:");
            System.out.println(Arrays.toString(linie));
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
