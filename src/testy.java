
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class testy
{
    public static void main(String[] args)
    {
        if (args.length != 1) {
            System.err.println("Sposób użycia: java FileScannerDemo nazwaPliku");
            System.exit(1);
        }

        Scanner file;
        int ile = 0;
        try {
            file = new Scanner(new File(args[0]));
            while (file.hasNextLine()) {
                String line = file.nextLine();
                ++ile;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());
            System.exit(2);
        } finally {
            System.err.print("\nLiczba linii w pliku: " + ile + "\n");
        }
    }
}