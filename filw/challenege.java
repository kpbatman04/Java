package filw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class challenege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter filename you wish to read from : ");
        String filename = sc.next();
        try (FileReader reader = new FileReader(filename)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException f) {
            System.out.printf("%s not found.", filename);
        } catch (IOException e) {
            System.out.printf("Exception occured ,%s", e.getMessage());
        }
    }
}