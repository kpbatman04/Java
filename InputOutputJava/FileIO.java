package InputOutputJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        String[] names = new String[]{"john","carl","jeery"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hi there, fuck you");
            writer.write("Hi miss, fuck you");
            for(String name : names){
                writer.write("\n"+name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
