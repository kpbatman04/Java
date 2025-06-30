package filw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class writer {
    public static void main(String[] args)throws IOException {
        String filename = "java-course.txt";
        try ( FileWriter writer = new FileWriter(filename)){

            writer.write("This is the best java course");
            for (int i = 0; i<10;i++){
                writer.write('*');
            }
            writer.flush();//not cumplsory , just for preference
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.printf("Exception occured   %s\n",e.getMessage());
        }
    }
}
