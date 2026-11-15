package VDT;
import java.util.Scanner ;
//Digital Storage Converter
//Read a file size in bytes and display the number of complete GB, MB, KB, and remaining bytes.
//KB → MB → GB → TB → PB → EB → ZB → YB
public class StorageCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of bytes : ");
        int bytes = s.nextInt();

        int mega = 0;
        int giga = 0;
        int tera = 0;

        int kilo = bytes / 1024;
        if (kilo > 1024) {
            mega = kilo / 1024;
        } else System.out.println(kilo + "KiloBytes(KB)");

        if (mega > 1024) {
            giga = mega / 1024;
        } else System.out.println(mega + "MegaBytes(MB) & " + kilo + ("KiloBytes(KB)"));

        if (giga>1024) {
            tera = giga/1024;
        }

    }
}

